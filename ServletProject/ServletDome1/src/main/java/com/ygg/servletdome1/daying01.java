package com.ygg.servletdome1;

import java.sql.SQLOutput;

/**
 * @Auther: TcYgg
 * @Date: 2024/2/23 - 02 - 23 - 14:20
 * @Description: com.ygg.servletdome1
 * @version: 1.0
 */
public class daying01 {
    public static void main(String[] args) {


        String aa =
                "SELECT \"work_station_code\" as \"work_station_code\",AVG(NULLIF(TRIM(\"great_cpk_rate\"::VARCHAR), '')::NUMERIC) as \"AVG(`great_cpk_rate`)\" FROM (with t1_1 as( select * from ( select factory_code , t0.project, coalesce(t0.process_section_code, d1.process_section_code) as process_section_code, coalesce(t0.line_code, d1.line_code) as line_code, coalesce(t0.work_station_code, d1.work_station_code) as work_station_code, t0.device_code, process_result, function_name , test_item , test_result, test_desc, hi_limit , low_limit , result_val, sn, test_item_seq, test_tm from dwd_prod_process_test_items_log_ri t0 left join dim_cp_device_info d1 on t0.project = d1.project and t0.device_code = d1.device_code where process_tm >='2023-12-21 00:00:00' and process_tm< '2023-12-22 00:00:00' and t0.project = 'M3' and product_mode <>'offline' and test_item <>'null' and coalesce(slot,'') <> '' and slot<>'null' and not (hi_limit = 99999999.99 and low_limit = -99999999.99) )t_a where 1 = 1 and process_section_code = 'FAT' and line_code = 'Z01' and coalesce(line_code,'') <> '' and ( (process_section_code= 'SAT' and not (hi_limit <= 0.1 and low_limit >= -0.1) ) or (process_section_code='MBA' and ( (work_station_code = 'MBACF' and ( test_item like '%Attach%' )) or (work_station_code = 'MBBS' and( test_item like '%Attach%' )) or (work_station_code = 'MBACP' and( test_item like '%Attach%' )) or (work_station_code = 'MBAGF' and( test_item like '%Attach%' )) ) ) or ( process_section_code= 'PFA' and ( (work_station_code = 'TPAPF' and ( test_item like '%Tp_Screen_Film_Pressuer%' or test_item like '%Tp_Screen_Film_Inspect%')) or (work_station_code = 'FAAFF' and ( test_item like '%FrontBracket_Camera%' or test_item like '%FrontBracket_Sucker%' or test_item like '%Receiver_-_%')) or (work_station_code = 'RMP' and ( test_item like '%Motor_Indenter_Press_Pressure%' or test_item like '%Receiver_Indenter_Press_Pressure%')) or (work_station_code = 'TGA' and ( test_item like '%TP_Indenter_Press%' and test_item not like '%TP_Indenter_Press_Usingtimes%')) )) or ( process_section_code= 'FA' and ( (work_station_code = 'BCALP' and test_item like '%_-_Lens_Attach%') or (work_station_code = 'BAP' and( test_item like '%Roll_Pressure%' or test_item like '%time%')) or (work_station_code = 'BCPF' and test_item like '%pressure%') or (work_station_code = 'BCPFC' and ( test_item like '%pressure%' or test_item like '%time%') ) )) or ( process_section_code= 'FAT' ) ) ) ,t1_2 as( select factory_code , project, t1_1.process_section_code, line_code , t1_1.work_station_code , process_result, function_name , test_item , test_result, test_desc, round(hi_limit::numeric, 2) :: varchar as hi_limit_original, round(low_limit::numeric, 2) :: varchar as low_limit_original, case when ((t1_1.work_station_code like '%MBBS%' and test_item like '%Pressure%') or (t1_1.work_station_code like '%MBACP%' and test_item like '%BigCopperFoil%')) then 5 else hi_limit end as hi_limit, case when (t1_1.work_station_code like '%RAUD%' and function_name in ('BottomSpeaker', 'BottomSpeakerHP', 'MainMic','Receiver','TopMic','TopSpeaker','TopSpeakerHP') and low_limit = -0.1 ) then -99999999.99 when ((t1_1.work_station_code like '%MBBS%' and test_item like '%Pressure%') or (t1_1.work_station_code like '%MBACP%' and test_item like '%BigCopperFoil%')) then -5 else low_limit end as low_limit , case when (t1_1.process_section_code = 'MBA' and test_item like '%Nozzle_Attach%' ) then result_val * 0.0086 else result_val end as result_val, devi_val, test_val_coeff, sn, row_number () over(partition by project , t1_1.process_section_code, t1_1.work_station_code, function_name, test_item, hi_limit, low_limit,sn order by test_tm , test_item_seq ) as order_esc, row_number () over(partition by project , t1_1.process_section_code, t1_1.work_station_code, function_name, test_item,hi_limit, low_limit, sn order by test_tm desc, test_item_seq desc ) as order_desc, case when d.process_section_code is null then 0 else 1 end as flag from t1_1 left join dim_procescc_section_devi d on t1_1.process_section_code = d.process_section_code and t1_1.work_station_code = d.work_station_code ) ,t1_3 as ( select factory_code , project, process_section_code, line_code , work_station_code , function_name , test_item , hi_limit , low_limit , hi_limit_original, low_limit_original, count(distinct sn) as sample_size, sum(case when order_esc = 1 and test_result ='PASS' then 1 else 0 end) as pass_num_first, sum(case when order_desc = 1 and test_result ='PASS' then 1 else 0 end ) as pass_num_final, avg(case when test_result ='PASS' then result_val else null end ) as avg_val, stddev_pop(case when test_result ='PASS' then result_val else null end) as std_val, max(test_val_coeff) as test_val_coeff, max(devi_val) as devi_val, flag from t1_2 group by factory_code, project , process_section_code , line_code, work_station_code, function_name, test_item, hi_limit_original,low_limit_original, low_limit, hi_limit,flag ) ,t1 as ( select factory_code , project, process_section_code, line_code , work_station_code , function_name , test_item , hi_limit_original, low_limit_original, case when (flag=1 and process_section_code = 'MBA' ) then avg_val+abs(hi_limit) when (flag =1 and (process_section_code = 'PFA' or process_section_code = 'FA')) then avg_val + devi_val else hi_limit end as hi_limit, case when (flag=1 and process_section_code = 'MBA') then avg_val-abs(low_limit) when (flag =1 and (process_section_code = 'PFA' or process_section_code = 'FA')) then avg_val - devi_val else low_limit end as low_limit, sample_size, pass_num_first, pass_num_final, avg_val , std_val from t1_3 ) ,t2 as ( select t1.* , process_section_name, work_station_name, (hi_limit+low_limit)/2 as spec_center, (hi_limit-low_limit) as spec_tolerance, case when pass_num_first=0 or sample_size=0 then 0 else pass_num_first/CAST(sample_size AS NUMERIC) end as item_rate_first, case when pass_num_final=0 or sample_size=0 then 0 else pass_num_final/CAST(sample_size AS NUMERIC) end as item_rate_final, case when hi_limit=99999999.99 then 99999999.99 else case when std_val <= 0.00001 then 2.68 else (hi_limit-avg_val)/(3*std_val) end end as cpu_val, case when low_limit=-99999999.99 then -99999999.99 else case when std_val <= 0.00001 then 2.68 else (avg_val-low_limit)/(3*std_val) end end as cpl_val from t1 left join (select distinct project,process_section_code,process_section_name,line_code,work_station_code,work_station_name from dim_cp_device_info) d1 on t1.project = d1.project and t1.process_section_code = d1.process_section_code and t1.line_code = d1.line_code and t1.work_station_code =d1.work_station_code ), t3 as ( select factory_code , project, process_section_code, process_section_name, line_code , work_station_code , work_station_name, function_name , test_item , hi_limit_original, low_limit_original, round(hi_limit::numeric ,2) as hi_limit, round(low_limit:: numeric , 2) as low_limit, case when hi_limit = 99999999.99 then 'null' else round(hi_limit::numeric, 2) :: varchar end as hi_limit_change, case when low_limit = -99999999.99 then 'null' else round(low_limit::numeric, 2) :: varchar end as low_limit_change, sample_size::varchar as sample_size, concat_ws('/', round(pass_num_first::numeric) :: varchar, concat(round(item_rate_first*100,2), '%')) as pass_num_first, concat_ws('/', round(pass_num_final::numeric) :: varchar, concat(round(item_rate_final*100,2), '%')) as pass_num_final, avg_val, std_val, spec_center, spec_tolerance, cpu_val, cpl_val, case when hi_limit <> 99999999.99 and low_limit=-99999999.99 then round(cpu_val::numeric, 2) when hi_limit=99999999.99 and low_limit <> -99999999.99 then round(cpl_val::numeric, 2) when hi_limit <>99999999.99 and low_limit <> -99999999.99 and hi_limit <> low_limit then case when cpu_val < cpl_val then round(cpu_val::numeric, 2) else round(cpl_val::numeric, 2) end else 2.68 end as cpk_val from t2), t4 as ( select *, case when cpk_val>1.67 then 'CPK>1.67' when cpk_val>1.33 and cpk_val<=1.67 then 'CPK>1.33且<=1.67' when cpk_val>1.00 and cpk_val<=1.33 then 'CPK>1.00且<=1.33' when cpk_val>0.67 and cpk_val<=1.00 then 'CPK>0.67且<=1.00' when cpk_val<=0.67 then 'CPK<=0.67' else 'null' end as cpk_type, case when cpk_val>1.67 then 'A+' when cpk_val>1.33 and cpk_val<=1.67 then 'A' when cpk_val>1.00 and cpk_val<=1.33 then 'B' when cpk_val>0.67 and cpk_val<=1.00 then 'C' when cpk_val<=0.67 then 'D' else 'null' end as cpk_level from t3 where cpk_val is not null ) select *, case when cpk_level <> 'null' then 1 else 0 end num, case when count(*)filter(where cpk_level = 'A+' or cpk_level = 'A'or cpk_level = 'B') over my_win !=0 then count(*)filter(where cpk_level = 'A+' or cpk_level = 'A'or cpk_level = 'B') over my_win*1.0/count(*) over my_win else 0 end as great_cpk_rate from t4 window my_win as (partition by factory_code ,project, process_section_code,process_section_name,line_code,work_station_code)) as t_3dc278e916ec576d WHERE 1=1 GROUP BY work_station_code HAVING 1=1 LIMIT 50 "
                ;



        String bb =
                "SELECT `factory` as \"factory\",`remark_f` as \"remark_f\",`quality` as \"quality\",`remark_q` as \"remark_q\",`update_time` as \"update_time\",`create_time` as \"create_time\",`expect_arrival_time` as \"expect_arrival_time\",`percent` as \"percent\",CAST(`sampleNum` AS SIGNED) as \"sampleNum\",CAST(`id` AS SIGNED) as \"id\",CAST(`allNum` AS SIGNED) as \"allNum\" FROM (select * from ygg_bolatu_03) as t_1c46f3f38dff7b1c WHERE 1=1 AND ((factory not in('null',' ') and (factory IS NOT NULL and LOWER(factory) != 'null') and REPLACE (factory,' ','') != '' )) AND ((quality not in('null',' ') and (quality IS NOT NULL and LOWER(quality) != 'null') and REPLACE (quality,' ','') != '' )) LIMIT 20 "
                ;

        String cc =
                "select quality as column_val, count(*) as column_cnt from (select * from ygg_bolatu_03) as t_1c46f3f38dff7b1c  WHERE 1=1  AND  (((factory  not in('null',' ') and (factory  IS NOT NULL  and LOWER(factory) != 'null') and REPLACE (factory,' ','')  != '' )))  group by quality limit 1000"

                ;




        System.out.println(aa);



        System.out.println(bb);
        System.out.println(cc);


        boolean equals = aa.equals(bb);
        System.out.println(equals);


    }







}



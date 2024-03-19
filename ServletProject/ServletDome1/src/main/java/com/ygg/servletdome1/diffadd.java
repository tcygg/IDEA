package com.ygg.servletdome1;

/**
 * @Auther: TcYgg
 * @Date: 2024/2/26 - 02 - 26 - 18:03
 * @Description: com.ygg.servletdome1
 * @version: 1.0
 */
public class diffadd {
    String AA =
            "SELECT\n" +
                    "\t\"work_station_code\" AS \"work_station_code\",\n" +
                    "\tAVG( NULLIF( TRIM( \"great_cpk_rate\" :: VARCHAR ), '' ):: NUMERIC ) AS \"AVG(`great_cpk_rate`)\" \n" +
                    "FROM\n" +
                    "\t(\n" +
                    "\t\tWITH t1_1 AS (\n" +
                    "\t\tSELECT\n" +
                    "\t\t\t* \n" +
                    "\t\tFROM\n" +
                    "\t\t\t(\n" +
                    "\t\t\tSELECT\n" +
                    "\t\t\t\tfactory_code,\n" +
                    "\t\t\t\tt0.project,\n" +
                    "\t\t\t\tCOALESCE ( t0.process_section_code, d1.process_section_code ) AS process_section_code,\n" +
                    "\t\t\t\tCOALESCE ( t0.line_code, d1.line_code ) AS line_code,\n" +
                    "\t\t\t\tCOALESCE ( t0.work_station_code, d1.work_station_code ) AS work_station_code,\n" +
                    "\t\t\t\tt0.device_code,\n" +
                    "\t\t\t\tprocess_result,\n" +
                    "\t\t\t\tfunction_name,\n" +
                    "\t\t\t\ttest_item,\n" +
                    "\t\t\t\ttest_result,\n" +
                    "\t\t\t\ttest_desc,\n" +
                    "\t\t\t\thi_limit,\n" +
                    "\t\t\t\tlow_limit,\n" +
                    "\t\t\t\tresult_val,\n" +
                    "\t\t\t\tsn,\n" +
                    "\t\t\t\ttest_item_seq,\n" +
                    "\t\t\t\ttest_tm \n" +
                    "\t\t\tFROM\n" +
                    "\t\t\t\tdwd_prod_process_test_items_log_ri t0\n" +
                    "\t\t\t\tLEFT JOIN dim_cp_device_info d1 ON t0.project = d1.project \n" +
                    "\t\t\t\tAND t0.device_code = d1.device_code \n" +
                    "\t\t\tWHERE\n" +
                    "\t\t\t\tprocess_tm >= '2024-02-26 09:00:00' \n" +
                    "\t\t\t\tAND process_tm < '2024-02-26 17:33:12' \n" +
                    "\t\t\t\tAND t0.project = 'N3' \n" +
                    "\t\t\t\tAND product_mode <> 'offline' \n" +
                    "\t\t\t\tAND test_item <> 'null' \n" +
                    "\t\t\t\tAND COALESCE ( slot, '' ) <> '' \n" +
                    "\t\t\t\tAND slot <> 'null' \n" +
                    "\t\t\t\tAND NOT ( hi_limit = 99999999.99 AND low_limit = - 99999999.99 ) \n" +
                    "\t\t\t) t_a \n" +
                    "\t\tWHERE\n" +
                    "\t\t\t1 = 1 \n" +
                    "\t\t\tAND process_section_code = 'FAT' \n" +
                    "\t\t\tAND line_code = 'Z02' \n" +
                    "\t\t\tAND COALESCE ( line_code, '' ) <> '' \n" +
                    "\t\t\tAND (\n" +
                    "\t\t\t\t( process_section_code = 'SAT' AND NOT ( hi_limit <= 0.1 AND low_limit >= - 0.1 ) ) \n" +
                    "\t\t\t\tOR (\n" +
                    "\t\t\t\t\tprocess_section_code = 'MBA' \n" +
                    "\t\t\t\t\tAND (\n" +
                    "\t\t\t\t\t\t(\n" +
                    "\t\t\t\t\t\t\twork_station_code = 'MBACF' \n" +
                    "\t\t\t\t\t\tAND ( test_item LIKE '%Attach%' )) \n" +
                    "\t\t\t\t\t\tOR (\n" +
                    "\t\t\t\t\t\t\twork_station_code = 'MBBS' \n" +
                    "\t\t\t\t\t\tAND ( test_item LIKE '%Attach%' )) \n" +
                    "\t\t\t\t\t\tOR (\n" +
                    "\t\t\t\t\t\t\twork_station_code = 'MBACP' \n" +
                    "\t\t\t\t\t\tAND ( test_item LIKE '%Attach%' )) \n" +
                    "\t\t\t\t\t\tOR (\n" +
                    "\t\t\t\t\t\t\twork_station_code = 'MBAGF' \n" +
                    "\t\t\t\t\t\tAND ( test_item LIKE '%Attach%' )) \n" +
                    "\t\t\t\t\t) \n" +
                    "\t\t\t\t) \n" +
                    "\t\t\t\tOR (\n" +
                    "\t\t\t\t\tprocess_section_code = 'PFA' \n" +
                    "\t\t\t\t\tAND (\n" +
                    "\t\t\t\t\t\t(\n" +
                    "\t\t\t\t\t\t\twork_station_code = 'TPAPF' \n" +
                    "\t\t\t\t\t\tAND ( test_item LIKE '%Tp_Screen_Film_Pressuer%' OR test_item LIKE '%Tp_Screen_Film_Inspect%' )) \n" +
                    "\t\t\t\t\t\tOR (\n" +
                    "\t\t\t\t\t\t\twork_station_code = 'FAAFF' \n" +
                    "\t\t\t\t\t\tAND ( test_item LIKE '%FrontBracket_Camera%' OR test_item LIKE '%FrontBracket_Sucker%' OR test_item LIKE '%Receiver_-_%' )) \n" +
                    "\t\t\t\t\t\tOR (\n" +
                    "\t\t\t\t\t\t\twork_station_code = 'RMP' \n" +
                    "\t\t\t\t\t\tAND ( test_item LIKE '%Motor_Indenter_Press_Pressure%' OR test_item LIKE '%Receiver_Indenter_Press_Pressure%' )) \n" +
                    "\t\t\t\t\t\tOR (\n" +
                    "\t\t\t\t\t\t\twork_station_code = 'TGA' \n" +
                    "\t\t\t\t\t\tAND ( test_item LIKE '%TP_Indenter_Press%' AND test_item NOT LIKE '%TP_Indenter_Press_Usingtimes%' )) \n" +
                    "\t\t\t\t\t)) \n" +
                    "\t\t\t\tOR (\n" +
                    "\t\t\t\t\tprocess_section_code = 'FA' \n" +
                    "\t\t\t\t\tAND (\n" +
                    "\t\t\t\t\t\t( work_station_code = 'BCALP' AND test_item LIKE '%_-_Lens_Attach%' ) \n" +
                    "\t\t\t\t\t\tOR (\n" +
                    "\t\t\t\t\t\t\twork_station_code = 'BAP' \n" +
                    "\t\t\t\t\t\tAND ( test_item LIKE '%Roll_Pressure%' OR test_item LIKE '%time%' )) \n" +
                    "\t\t\t\t\t\tOR ( work_station_code = 'BCPF' AND test_item LIKE '%pressure%' ) \n" +
                    "\t\t\t\t\t\tOR ( work_station_code = 'BCPFC' AND ( test_item LIKE '%pressure%' OR test_item LIKE '%time%' ) ) \n" +
                    "\t\t\t\t\t)) \n" +
                    "\t\t\t\tOR ( process_section_code = 'FAT' ) \n" +
                    "\t\t\t) \n" +
                    "\t\t),\n" +
                    "\t\tt1_2 AS (\n" +
                    "\t\tSELECT\n" +
                    "\t\t\tfactory_code,\n" +
                    "\t\t\tproject,\n" +
                    "\t\t\tt1_1.process_section_code,\n" +
                    "\t\t\tline_code,\n" +
                    "\t\t\tt1_1.work_station_code,\n" +
                    "\t\t\tprocess_result,\n" +
                    "\t\t\tfunction_name,\n" +
                    "\t\t\ttest_item,\n" +
                    "\t\t\ttest_result,\n" +
                    "\t\t\ttest_desc,\n" +
                    "\t\t\tround( hi_limit :: NUMERIC, 2 ) :: VARCHAR AS hi_limit_original,\n" +
                    "\t\t\tround( low_limit :: NUMERIC, 2 ) :: VARCHAR AS low_limit_original,\n" +
                    "\t\tCASE\n" +
                    "\t\t\t\t\n" +
                    "\t\t\t\tWHEN ((\n" +
                    "\t\t\t\t\t\tt1_1.work_station_code LIKE '%MBBS%' \n" +
                    "\t\t\t\t\t\tAND test_item LIKE '%Pressure%' \n" +
                    "\t\t\t\t\t\t) \n" +
                    "\t\t\t\t\tOR ( t1_1.work_station_code LIKE '%MBACP%' AND test_item LIKE '%BigCopperFoil%' )) THEN\n" +
                    "\t\t\t\t\t5 ELSE hi_limit \n" +
                    "\t\t\t\tEND AS hi_limit,\n" +
                    "\t\t\tCASE\n" +
                    "\t\t\t\t\t\n" +
                    "\t\t\t\t\tWHEN ( t1_1.work_station_code LIKE '%RAUD%' AND function_name IN ( 'BottomSpeaker', 'BottomSpeakerHP', 'MainMic', 'Receiver', 'TopMic', 'TopSpeaker', 'TopSpeakerHP' ) AND low_limit = - 0.1 ) THEN\n" +
                    "\t\t\t\t\t- 99999999.99 \n" +
                    "\t\t\t\t\tWHEN ((\n" +
                    "\t\t\t\t\t\t\tt1_1.work_station_code LIKE '%MBBS%' \n" +
                    "\t\t\t\t\t\t\tAND test_item LIKE '%Pressure%' \n" +
                    "\t\t\t\t\t\t\t) \n" +
                    "\t\t\t\t\t\tOR ( t1_1.work_station_code LIKE '%MBACP%' AND test_item LIKE '%BigCopperFoil%' )) THEN\n" +
                    "\t\t\t\t\t\t- 5 ELSE low_limit \n" +
                    "\t\t\t\t\tEND AS low_limit,\n" +
                    "\t\t\t\tCASE\n" +
                    "\t\t\t\t\t\t\n" +
                    "\t\t\t\t\t\tWHEN ( t1_1.process_section_code = 'MBA' AND test_item LIKE '%Nozzle_Attach%' ) THEN\n" +
                    "\t\t\t\t\t\tresult_val * 0.0086 ELSE result_val \n" +
                    "\t\t\t\t\tEND AS result_val,\n" +
                    "\t\t\t\t\tdevi_val,\n" +
                    "\t\t\t\t\ttest_val_coeff,\n" +
                    "\t\t\t\t\tsn,\n" +
                    "\t\t\t\t\trow_number () over ( PARTITION BY project, t1_1.process_section_code, t1_1.work_station_code, function_name, test_item, hi_limit, low_limit, sn ORDER BY test_tm, test_item_seq ) AS order_esc,\n" +
                    "\t\t\t\t\trow_number () over ( PARTITION BY project, t1_1.process_section_code, t1_1.work_station_code, function_name, test_item, hi_limit, low_limit, sn ORDER BY test_tm DESC, test_item_seq DESC ) AS order_desc,\n" +
                    "\t\t\t\tCASE\n" +
                    "\t\t\t\t\t\t\n" +
                    "\t\t\t\t\t\tWHEN d.process_section_code IS NULL THEN\n" +
                    "\t\t\t\t\t\t0 ELSE 1 \n" +
                    "\t\t\t\t\tEND AS flag \n" +
                    "\t\t\t\tFROM\n" +
                    "\t\t\t\t\tt1_1\n" +
                    "\t\t\t\t\tLEFT JOIN dim_procescc_section_devi d ON t1_1.process_section_code = d.process_section_code \n" +
                    "\t\t\t\t\tAND t1_1.work_station_code = d.work_station_code \n" +
                    "\t\t\t\t),\n" +
                    "\t\t\t\tt1_3 AS (\n" +
                    "\t\t\t\tSELECT\n" +
                    "\t\t\t\t\tfactory_code,\n" +
                    "\t\t\t\t\tproject,\n" +
                    "\t\t\t\t\tprocess_section_code,\n" +
                    "\t\t\t\t\tline_code,\n" +
                    "\t\t\t\t\twork_station_code,\n" +
                    "\t\t\t\t\tfunction_name,\n" +
                    "\t\t\t\t\ttest_item,\n" +
                    "\t\t\t\t\thi_limit,\n" +
                    "\t\t\t\t\tlow_limit,\n" +
                    "\t\t\t\t\thi_limit_original,\n" +
                    "\t\t\t\t\tlow_limit_original,\n" +
                    "\t\t\t\t\tcount( DISTINCT sn ) AS sample_size,\n" +
                    "\t\t\t\t\tsum( CASE WHEN order_esc = 1 AND test_result = 'PASS' THEN 1 ELSE 0 END ) AS pass_num_first,\n" +
                    "\t\t\t\t\tsum( CASE WHEN order_desc = 1 AND test_result = 'PASS' THEN 1 ELSE 0 END ) AS pass_num_final,\n" +
                    "\t\t\t\t\tavg( CASE WHEN test_result = 'PASS' THEN result_val ELSE NULL END ) AS avg_val,\n" +
                    "\t\t\t\t\tstddev_pop( CASE WHEN test_result = 'PASS' THEN result_val ELSE NULL END ) AS std_val,\n" +
                    "\t\t\t\t\tmax( test_val_coeff ) AS test_val_coeff,\n" +
                    "\t\t\t\t\tmax( devi_val ) AS devi_val,\n" +
                    "\t\t\t\t\tflag \n" +
                    "\t\t\t\tFROM\n" +
                    "\t\t\t\t\tt1_2 \n" +
                    "\t\t\t\tGROUP BY\n" +
                    "\t\t\t\t\tfactory_code,\n" +
                    "\t\t\t\t\tproject,\n" +
                    "\t\t\t\t\tprocess_section_code,\n" +
                    "\t\t\t\t\tline_code,\n" +
                    "\t\t\t\t\twork_station_code,\n" +
                    "\t\t\t\t\tfunction_name,\n" +
                    "\t\t\t\t\ttest_item,\n" +
                    "\t\t\t\t\thi_limit_original,\n" +
                    "\t\t\t\t\tlow_limit_original,\n" +
                    "\t\t\t\t\tlow_limit,\n" +
                    "\t\t\t\t\thi_limit,\n" +
                    "\t\t\t\t\tflag \n" +
                    "\t\t\t\t),\n" +
                    "\t\t\t\tt1 AS (\n" +
                    "\t\t\t\tSELECT\n" +
                    "\t\t\t\t\tfactory_code,\n" +
                    "\t\t\t\t\tproject,\n" +
                    "\t\t\t\t\tprocess_section_code,\n" +
                    "\t\t\t\t\tline_code,\n" +
                    "\t\t\t\t\twork_station_code,\n" +
                    "\t\t\t\t\tfunction_name,\n" +
                    "\t\t\t\t\ttest_item,\n" +
                    "\t\t\t\t\thi_limit_original,\n" +
                    "\t\t\t\t\tlow_limit_original,\n" +
                    "\t\t\t\tCASE\n" +
                    "\t\t\t\t\t\t\n" +
                    "\t\t\t\t\t\tWHEN ( flag = 1 AND process_section_code = 'MBA' ) THEN\n" +
                    "\t\t\t\t\t\tavg_val + abs( hi_limit ) \n" +
                    "\t\t\t\t\t\tWHEN (\n" +
                    "\t\t\t\t\t\t\tflag = 1 \n" +
                    "\t\t\t\t\t\t\tAND ( process_section_code = 'PFA' OR process_section_code = 'FA' )) THEN\n" +
                    "\t\t\t\t\t\t\tavg_val + devi_val ELSE hi_limit \n" +
                    "\t\t\t\t\t\tEND AS hi_limit,\n" +
                    "\t\t\t\t\tCASE\n" +
                    "\t\t\t\t\t\t\t\n" +
                    "\t\t\t\t\t\t\tWHEN ( flag = 1 AND process_section_code = 'MBA' ) THEN\n" +
                    "\t\t\t\t\t\t\tavg_val - abs( low_limit ) \n" +
                    "\t\t\t\t\t\t\tWHEN (\n" +
                    "\t\t\t\t\t\t\t\tflag = 1 \n" +
                    "\t\t\t\t\t\t\t\tAND ( process_section_code = 'PFA' OR process_section_code = 'FA' )) THEN\n" +
                    "\t\t\t\t\t\t\t\tavg_val - devi_val ELSE low_limit \n" +
                    "\t\t\t\t\t\t\tEND AS low_limit,\n" +
                    "\t\t\t\t\t\t\tsample_size,\n" +
                    "\t\t\t\t\t\t\tpass_num_first,\n" +
                    "\t\t\t\t\t\t\tpass_num_final,\n" +
                    "\t\t\t\t\t\t\tavg_val,\n" +
                    "\t\t\t\t\t\t\tstd_val \n" +
                    "\t\t\t\t\t\tFROM\n" +
                    "\t\t\t\t\t\t\tt1_3 \n" +
                    "\t\t\t\t\t\t),\n" +
                    "\t\t\t\t\t\tt2 AS (\n" +
                    "\t\t\t\t\t\tSELECT\n" +
                    "\t\t\t\t\t\t\tt1.*,\n" +
                    "\t\t\t\t\t\t\tprocess_section_name,\n" +
                    "\t\t\t\t\t\t\twork_station_name,\n" +
                    "\t\t\t\t\t\t\t( hi_limit + low_limit )/ 2 AS spec_center,\n" +
                    "\t\t\t\t\t\t\t( hi_limit - low_limit ) AS spec_tolerance,\n" +
                    "\t\t\t\t\t\tCASE\n" +
                    "\t\t\t\t\t\t\t\t\n" +
                    "\t\t\t\t\t\t\t\tWHEN pass_num_first = 0 \n" +
                    "\t\t\t\t\t\t\t\tOR sample_size = 0 THEN\n" +
                    "\t\t\t\t\t\t\t\t\t0 ELSE pass_num_first / CAST( sample_size AS NUMERIC ) \n" +
                    "\t\t\t\t\t\t\t\t\tEND AS item_rate_first,\n" +
                    "\t\t\t\t\t\t\tCASE\n" +
                    "\t\t\t\t\t\t\t\t\t\n" +
                    "\t\t\t\t\t\t\t\t\tWHEN pass_num_final = 0 \n" +
                    "\t\t\t\t\t\t\t\t\tOR sample_size = 0 THEN\n" +
                    "\t\t\t\t\t\t\t\t\t\t0 ELSE pass_num_final / CAST( sample_size AS NUMERIC ) \n" +
                    "\t\t\t\t\t\t\t\t\t\tEND AS item_rate_final,\n" +
                    "\t\t\t\t\t\t\t\tCASE\n" +
                    "\t\t\t\t\t\t\t\t\t\t\n" +
                    "\t\t\t\t\t\t\t\t\t\tWHEN hi_limit = 99999999.99 THEN\n" +
                    "\t\t\t\t\t\t\t\t\t\t99999999.99 ELSE\n" +
                    "\t\t\t\t\t\t\t\t\tCASE\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\n" +
                    "\t\t\t\t\t\t\t\t\t\t\tWHEN std_val <= 0.00001 THEN\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t2.68 ELSE ( hi_limit - avg_val )/(\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t3 * std_val \n" +
                    "\t\t\t\t\t\t\t\t\t\t\t) \n" +
                    "\t\t\t\t\t\t\t\t\t\tEND \n" +
                    "\t\t\t\t\t\t\t\t\t\tEND AS cpu_val,\n" +
                    "\t\t\t\t\t\t\t\t\tCASE\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\n" +
                    "\t\t\t\t\t\t\t\t\t\t\tWHEN low_limit =- 99999999.99 THEN\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t- 99999999.99 ELSE\n" +
                    "\t\t\t\t\t\t\t\t\t\tCASE\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\tWHEN std_val <= 0.00001 THEN\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t2.68 ELSE ( avg_val - low_limit )/(\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t3 * std_val \n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t) \n" +
                    "\t\t\t\t\t\t\t\t\t\t\tEND \n" +
                    "\t\t\t\t\t\t\t\t\t\t\tEND AS cpl_val \n" +
                    "\t\t\t\t\t\t\t\t\t\tFROM\n" +
                    "\t\t\t\t\t\t\t\t\t\t\tt1\n" +
                    "\t\t\t\t\t\t\t\t\t\t\tLEFT JOIN ( SELECT DISTINCT project, process_section_code, process_section_name, line_code, work_station_code, work_station_name FROM dim_cp_device_info ) d1 ON t1.project = d1.project \n" +
                    "\t\t\t\t\t\t\t\t\t\t\tAND t1.process_section_code = d1.process_section_code \n" +
                    "\t\t\t\t\t\t\t\t\t\t\tAND t1.line_code = d1.line_code \n" +
                    "\t\t\t\t\t\t\t\t\t\t\tAND t1.work_station_code = d1.work_station_code \n" +
                    "\t\t\t\t\t\t\t\t\t\t),\n" +
                    "\t\t\t\t\t\t\t\t\t\tt3 AS (\n" +
                    "\t\t\t\t\t\t\t\t\t\tSELECT\n" +
                    "\t\t\t\t\t\t\t\t\t\t\tfactory_code,\n" +
                    "\t\t\t\t\t\t\t\t\t\t\tproject,\n" +
                    "\t\t\t\t\t\t\t\t\t\t\tprocess_section_code,\n" +
                    "\t\t\t\t\t\t\t\t\t\t\tprocess_section_name,\n" +
                    "\t\t\t\t\t\t\t\t\t\t\tline_code,\n" +
                    "\t\t\t\t\t\t\t\t\t\t\twork_station_code,\n" +
                    "\t\t\t\t\t\t\t\t\t\t\twork_station_name,\n" +
                    "\t\t\t\t\t\t\t\t\t\t\tfunction_name,\n" +
                    "\t\t\t\t\t\t\t\t\t\t\ttest_item,\n" +
                    "\t\t\t\t\t\t\t\t\t\t\thi_limit_original,\n" +
                    "\t\t\t\t\t\t\t\t\t\t\tlow_limit_original,\n" +
                    "\t\t\t\t\t\t\t\t\t\t\tround( hi_limit :: NUMERIC, 2 ) AS hi_limit,\n" +
                    "\t\t\t\t\t\t\t\t\t\t\tround( low_limit :: NUMERIC, 2 ) AS low_limit,\n" +
                    "\t\t\t\t\t\t\t\t\t\tCASE\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\tWHEN hi_limit = 99999999.99 THEN\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t'null' ELSE round( hi_limit :: NUMERIC, 2 ) :: VARCHAR \n" +
                    "\t\t\t\t\t\t\t\t\t\t\tEND AS hi_limit_change,\n" +
                    "\t\t\t\t\t\t\t\t\t\tCASE\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\tWHEN low_limit = - 99999999.99 THEN\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t'null' ELSE round( low_limit :: NUMERIC, 2 ) :: VARCHAR \n" +
                    "\t\t\t\t\t\t\t\t\t\t\tEND AS low_limit_change,\n" +
                    "\t\t\t\t\t\t\t\t\t\t\tsample_size :: VARCHAR AS sample_size,\n" +
                    "\t\t\t\t\t\t\t\t\t\t\tconcat_ws(\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t'/',\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\tround( pass_num_first :: NUMERIC ) :: VARCHAR,\n" +
                    "\t\t\t\t\t\t\t\t\t\t\tconcat( round( item_rate_first * 100, 2 ), '%' )) AS pass_num_first,\n" +
                    "\t\t\t\t\t\t\t\t\t\t\tconcat_ws(\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t'/',\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\tround( pass_num_final :: NUMERIC ) :: VARCHAR,\n" +
                    "\t\t\t\t\t\t\t\t\t\t\tconcat( round( item_rate_final * 100, 2 ), '%' )) AS pass_num_final,\n" +
                    "\t\t\t\t\t\t\t\t\t\t\tavg_val,\n" +
                    "\t\t\t\t\t\t\t\t\t\t\tstd_val,\n" +
                    "\t\t\t\t\t\t\t\t\t\t\tspec_center,\n" +
                    "\t\t\t\t\t\t\t\t\t\t\tspec_tolerance,\n" +
                    "\t\t\t\t\t\t\t\t\t\t\tcpu_val,\n" +
                    "\t\t\t\t\t\t\t\t\t\t\tcpl_val,\n" +
                    "\t\t\t\t\t\t\t\t\t\tCASE\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\tWHEN hi_limit <> 99999999.99 \n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\tAND low_limit =- 99999999.99 THEN\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\tround( cpu_val :: NUMERIC, 2 ) \n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\tWHEN hi_limit = 99999999.99 \n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\tAND low_limit <> - 99999999.99 THEN\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\tround( cpl_val :: NUMERIC, 2 ) \n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\tWHEN hi_limit <> 99999999.99 \n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\tAND low_limit <> - 99999999.99 \n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\tAND hi_limit <> low_limit THEN\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\tCASE\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tWHEN cpu_val < cpl_val THEN\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tround( cpu_val :: NUMERIC, 2 ) ELSE round( cpl_val :: NUMERIC, 2 ) \n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tEND ELSE 2.68 \n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\tEND AS cpk_val \n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\tFROM\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\tt2 \n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t),\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\tt4 AS (\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\tSELECT\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\t*,\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\tCASE\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tWHEN cpk_val > 1.67 THEN\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'CPK>1.67' \n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tWHEN cpk_val > 1.33 \n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tAND cpk_val <= 1.67 THEN 'CPK>1.33且<=1.67' WHEN cpk_val > 1.00 \n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tAND cpk_val <= 1.33 THEN 'CPK>1.00且<=1.33' WHEN cpk_val > 0.67 \n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tAND cpk_val <= 1.00 THEN 'CPK>0.67且<=1.00' WHEN cpk_val <= 0.67 THEN 'CPK<=0.67' ELSE 'null' END AS cpk_type, CASE WHEN cpk_val > 1.67 THEN 'A+' WHEN cpk_val > 1.33 \n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tAND cpk_val <= 1.67 THEN 'A' WHEN cpk_val > 1.00 \n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tAND cpk_val <= 1.33 THEN 'B' WHEN cpk_val > 0.67 \n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tAND cpk_val <= 1.00 THEN\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'C' \n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tWHEN cpk_val <= 0.67 THEN\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'D' ELSE 'null' \n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tEND AS cpk_level \n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tFROM\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tt3 \n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tWHERE\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tcpk_val IS NOT NULL \n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t) SELECT\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t*,\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tCASE\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tWHEN cpk_level <> 'null' THEN\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1 ELSE 0 \n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tEND num,\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tCASE\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tWHEN count(*) filter ( WHERE cpk_level = 'A+' OR cpk_level = 'A' OR cpk_level = 'B' ) over my_win != 0 THEN\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tcount(*) filter ( WHERE cpk_level = 'A+' OR cpk_level = 'A' OR cpk_level = 'B' ) over my_win * 1.0 / count(*) over my_win ELSE 0 \n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tEND AS great_cpk_rate \n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tFROM\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tt4 window my_win AS ( PARTITION BY factory_code, project, process_section_code, process_section_name, line_code, work_station_code )) AS t_3dc278e916ec576d \n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\tWHERE\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1 = 1 \n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\tGROUP BY\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\twork_station_code \n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\tHAVING\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\t1 = 1 \n" +
                    "\tLIMIT 50"
            ;
}

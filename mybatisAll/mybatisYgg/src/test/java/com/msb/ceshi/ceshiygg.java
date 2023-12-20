package com.msb.ceshi;

import com.msb.pojo.Emp;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.*;




/**
 * @Auther: TcYgg
 * @Date: 2023/11/25 - 11 - 25 - 15:42
 * @Description: com.msb.ceshi
 * @version: 1.0
 */
public class ceshiygg {


    @Test
    public void ceshi() {

        List list = new ArrayList();

        Emp o1 = new Emp(1, "MCS-2019-1123");

        list.add(o1);

        Emp o2 = new Emp(2, "MCS-2019-1124");

        list.add(o2);

        Emp o3 = new Emp(3, "MCS-2019-1125");

        list.add(o3);
        System.out.println(list.get(o1.getEmpno()));

     /*   List orderNoList=list.stream().map(Emp::getEmpNo).collect(Collectors.toList());

        System.out.println("输出单号集合："+orderNoList);

        List idList=list.stream().map(Emp::getId()).collect(Collectors.toList());

        System.out.println(idList);*/
    }

    @Test
    public void YggList() {


        List list = new ArrayList();

        Emp o1 = new Emp(1, "MCS-2019-1123");

        list.add(o1);

        Emp o2 = new Emp(2, "MCS-2019-1124");

        list.add(o2);

        Emp o3 = new Emp(3, "MCS-2019-1125");

        list.add(o3);
        System.out.println(list.get(o1.getEmpno()));
        System.out.println(list.get(1));


        for (Object o : list) {
            System.out.println(o);

        }
        System.out.println("SELECT col_name,CAST(`col_num` AS DOUBLE) as \"col_num\" FROM (with t_factory as ( select date, stats_date, shift, factory_profit, factory_out_income as factory_income, factory_out_cost,total_factory_cost , factory_stock_cost ,row_number() over(order by date desc , shift desc ) as rn from ads_op_profit_factory_di where stats_date BETWEEN '2023-09-01' and '2023-10-31' and factory_id = 3880 ) ,t_factory_profit as ( select sum(factory_profit) as factory_profit, sum(factory_income) as factory_income, sum( factory_out_cost) as factory_out_cost ,sum(total_factory_cost) as total_factory_cost, sum(case when rn = 1 then factory_stock_cost else 0 end ) as factory_stock_cost from t_factory ) , t_all_rate as ( select factory_profit ,factory_income ,factory_out_cost ,total_factory_cost as total_factory_cost ,factory_stock_cost ,case when factory_income = 0 then 0 else factory_profit / factory_income end as profit_rate ,t2.idle_cost from t_factory_profit t1 inner join ( select sum(case when project = '闲置' then total_project_cost else 0 end) as idle_cost from ads_op_profit_project_di where stats_date BETWEEN '2023-09-01' and '2023-10-31' ) t2 on 1=1 ) ,t_all_rate_2 as ( select factory_profit ,factory_income ,factory_out_cost ,total_factory_cost ,factory_stock_cost ,profit_rate ,idle_cost ,factory_income - total_factory_cost as total_factory_profit ,case when factory_income = 0 then 0 else (factory_income - total_factory_cost) / factory_income end as total_profit_rate from t_all_rate ) select '项目利润率' as col_name, coalesce(sum(profit_rate), 0) as col_num from t_all_rate_2 union all select '项目利润' as col_name, coalesce(sum(factory_profit), 0) as col_num from t_all_rate_2 union all select '总收入' as col_name, coalesce(sum(factory_income), 0) as col_num from t_all_rate_2 union all select '出库收入' as col_name, coalesce(sum(factory_income), 0) as col_num from t_all_rate_2 union all select '出库成本' as col_name, coalesce(sum(factory_out_cost), 0) as col_num from t_all_rate_2 union all select '存货成本' as col_name, coalesce(sum(factory_stock_cost), 0) as col_num from t_all_rate_2 union all select '闲置成本' as col_name, coalesce(sum(idle_cost), 0) as col_num from t_all_rate_2 union all select '总支出' as col_name, coalesce(sum(total_factory_cost), 0) as col_num from t_all_rate_2 union all select '总利润率' as col_name, coalesce(sum(total_profit_rate), 0) as col_num from t_all_rate_2 union all select '收支净额' as col_name, coalesce(sum(total_factory_profit), 0) as col_num from t_all_rate_2 union all select '营业外收入' as col_name,261.21 as col_num from t_all_rate_2 union all select '营业外支出' as col_name,511.06 as col_num from t_all_rate_2) as t_1c46f3f38dff7b1c WHERE 1=1 LIMIT 20 "
        );


    }

    @Test
    public void 集合练习() {


        LinkedList<Emp> list = new LinkedList<Emp>();


//        System.out.println(list.remove(3));
//        System.out.println(list.set(3,"ds"));


        Emp s1 = new Emp(90,"林青霞");
        Emp s2 = new Emp(99,"风清扬");
        Emp s3 = new Emp(66,"张曼玉");

        list.add(s1);
        list.add(s2);
        list.add(s3);

//        System.out.println(list.get(3));
        System.out.println(list);

        for (Emp value: list) {

            System.out.println(value.getEname()+","+value.getEmpno());
        }

        System.out.println(list.get(2));
        Logger logger = LoggerFactory.getLogger(ceshiygg.class);
        logger.debug("debug信息");


        logger.error("error信息");
        logger.warn("warn信息");
        logger.info("info信息");
        logger.debug("debug信息");
        logger.trace("trace信息");




        //迭代器进行遍历

  /*      System.out.println(list);
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

        //普通for循环方式
        for (int i=0;i<list.size();i++){
            String s=list.get(i);
            System.out.println(s);
        }

        //加强for循环，foreach遍历方式
        for (String s : list) {
            System.out.println(s);
        }

*/

    }
    @Test
    public void meishi(){
        System.out.println("SELECT `order_no_yg` as \"order_no_yg\",`update_time` as \"update_time\",`create_time` as \"create_time\" FROM( SELECT `order_no_yg` as \"order_no_yg\",`update_time` as \"update_time\",`create_time` as \"create_time\" FROM (SELECT * from ygg_order_01) as t_1c46f3f38dff7b1c WHERE 1=1 ) od_486892 ORDER BY od_486892.order_no_yg ASC LIMIT 1000 "
        );
        Logger logger = LoggerFactory.getLogger(ceshiygg.class);
        logger.debug("debug信息");


    }
    @Test
    public void Yg_order(){



    }
}
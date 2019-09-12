package cn.shanghai.sun;

public class Test {


    public static void main(String[] args) {
        //String msg="type@=chatmsg/rid@=9999/ct@=1/uid@=43522725/nn@=cloudsu000/txt@=不吃饭就没得/cid@=a0915d79d5184cc6ad9f760300000000/ic@=avatar@Sdefault@S01/level@=6/sahf@=0/cst@=1568278201017/bnn@=小僵尸/bl@=4/brid@=9999/hc@=8ccfd113d28375263b0964c7221773bf/el@=/lk@=/fl@=4/hb@=202@S/urlev@=13/";
       String msg="type@=chatmsg/rid@=9999/uid@=2026180/nn@=ti9冠军老干爹/txt@=第一步先进minor吧/cid@=654529859d1f4a2ebf7d770300000000/ic@=avanew@Sface@S201804@S68b1fe7be71718de3e35f19657839cde/level@=19/sahf@=0/col@=2/cst@=1568280008718/bnn@=小僵尸/bl@=8/brid@=9999/hc@=8ccfd113d28375263b0964c7221773bf/ifs@=1/el@=/lk@=/fl@=8/urlev@=14/";
        String[] ms = msg.split("/");
        int i=1;
        for(String temp:ms){
            System.out.println("#"+i+" "+temp);
            i++;
        }
    }
}

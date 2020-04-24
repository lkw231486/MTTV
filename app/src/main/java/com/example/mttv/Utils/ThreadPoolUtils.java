package com.example.mttv.Utils;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author zl
 * date 2019-02-22 上午 9:23
 * description:线程池
 */
public class ThreadPoolUtils {
    private static ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 5, 5, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(100));

    public static void exec(Runnable runnable) {
        threadPoolExecutor.execute(runnable);
    }
}
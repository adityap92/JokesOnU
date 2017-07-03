package com.jokesonu;

import android.support.test.InstrumentationRegistry;

import org.junit.Test;

import java.util.concurrent.ExecutionException;

import static junit.framework.Assert.assertFalse;

/**
 * Created by aditya on 7/3/17.
 */

public class AsyncTaskTest{

    @Test
    public void testNonNullTask() throws ExecutionException, InterruptedException {

        EndpointsAsyncTask task = new EndpointsAsyncTask();

        task.execute(InstrumentationRegistry.getTargetContext());
        String answer ="";
        answer = task.get();
        assertFalse("string not empty", answer.equals(""));
    }


}

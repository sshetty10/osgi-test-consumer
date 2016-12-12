package biz.neustar.osgi.consumer;

import biz.neustar.osgi.provider.HelloWorldService;

import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by sshetty on 12/12/16.
 */
public class HelloWorldConsumer implements ActionListener{
    private final HelloWorldService service;
    private final Timer timer;

    public HelloWorldConsumer(HelloWorldService service) {
        super();

        this.service = service;

        timer = new Timer(1000, this);
    }

    public void startTimer(){
        timer.start();
    }

    public void stopTimer() {
        timer.stop();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        service.hello();
    }

}

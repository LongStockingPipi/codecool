package pers.jason.designmode.observer.userdefined;

/**
 * @author Jason
 * @date 2021/8/24 23:19
 * @description 天气布告板
 */
public class CurrentConditionsDisplayer implements Observer, Exhibitor {

  private float temperature;

  private float humidity;

  private float pressure;

  private Subject weatherData;

  public CurrentConditionsDisplayer(Subject weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  @Override
  public void display() {
    System.out.println("当前天气：【温度 " + temperature + "，湿度 " + humidity + "，气压：" + pressure + "】");
  }

  @Override
  public void update(float temp, float humidity, float pressure) {
    this.temperature = temp;
    this.humidity = humidity;
    this.pressure = pressure;
    display();
  }
}

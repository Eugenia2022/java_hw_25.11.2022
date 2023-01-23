//25.11.2022
//Класс должен содержать поля lastDeployTime (в милисекундах), upDuration (в милисекундах), currentUri, type в виде строк, геттеры

//Класс должен содержать метод deploy(String version). Метод обновляет текущую версию, lastDeployTime, и обнуляет upDuration, и печатает сообщение, что новая версия успешно задеплоена.
//Если текущий environment "PROD", то метод бросает исключение.
//Можно создать свой класс проверяемого исключение или использовать NotOwnerException.

//Поле type не может меняться после создания класса

//Класс должен содержать статический метод listEnvs(), который возвращает массив строк "QA", "PROD", "DEV". Каждая строка является константой в данном  классе. 
//Константой - это значит, что значение принадлежит классу, общедоступно и его нельзя поменять

//В Main создать три экземпляра environement, qa, prod, dev.
//По очереди вызвать метод деплой несколько раз. 
//Попытку деплоя PROD обернуть в try-catch и в случае неудачи печатать сообщение "Domeone tried to deploy Prod"

public class Main {
    public static void main(String[] args){
        try{
            Environment envQa = new Environment("QA");
            envQa.deploy();
            
            Environment envDev = new Environment("DEV");
            envDev.deploy();

            Environment envProd = new Environment("PROD");
            envProd.deploy();
        } catch(Exception ex){
            System.out.println("Domeone tried to deploy Prod");
        }
    }
}

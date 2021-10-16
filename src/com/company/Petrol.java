package com.company;

public class Petrol extends Engine{
        private double volume; //Объем двигателя
        //Здесь можно прописать также крутящий момент, обороты двигателя и прочее
        // (надо более детально разбираться с устройством и характеристиками двигателя)

        public Petrol(double volume, double power){
            // !!! мощность можно рассчитать по переданным в конструктор параметрам(полям) двигателя
            // для простоты я ее сразу прописал, просто надо разбираться как ее считать правильно
            super("Бензин", power);
            this.volume=volume;

        }

        @Override
        public void go(){
            System.out.println("Рабочий цикл бензинового двигателя c объемом " + volume +" см^3 и мощностью "+getPower()+" лс");
        }

        @Override
        public void stop(){
            System.out.println("Остановка бензинового двигателя");
        }
}
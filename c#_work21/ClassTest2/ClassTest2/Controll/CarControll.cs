using ClassTest2.Model;
using ClassTest2.Util;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ClassTest2.Controll
{
    class CarController
    {
        List<Car> list = new List<Car>();
        RandData rand;

        public CarController(RandData rand)
        {
            this.rand = rand;
        }
        public void insRandData(int count)
        {
            for(int i=0; i<count; i++)
            {
                list.Add(new Car(
                    rand.getName(),
                    rand.getcolor(),
                    rand.getcompany(),
                    rand.getprice()));
                    
            }
        }
        public void carView()
        {
            for(int i=0; i<list.Count; i++)
            {
                Console.WriteLine("번호: " + (i + 1));
                Console.WriteLine(list[i].ToString());
            }
        }
        public void carView2()
        {
            for (int i = 0; i < list.Count; i++)
            {
                Console.WriteLine("번호: " + (i + 1));
                list[i].printInfoCar();
            }
        }
    }
}

using ClassTest2_1.Util;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ClassTest2_1.Controll
{
    class UnionController
    {
        CarController carHandle;
        CustController custHandle;
        SellController sellHandle;

        public UnionController(RandData rand)
        {
            carHandle = new CarController(rand);
            custHandle = new CustController(rand);
            sellHandle = new SellController(rand);
        }

        public UnionController(
            CarController carHandle, 
            CustController custHandle, 
            SellController sellHandle)
        {
            this.carHandle = carHandle;
            this.custHandle = custHandle;
            this.sellHandle = sellHandle;
        }

        internal CarController CarHandle { get => carHandle; set => carHandle = value; }
        internal CustController CustHandle { get => custHandle; set => custHandle = value; }
        internal SellController SellHandle { get => sellHandle; set => sellHandle = value; }
    }
}

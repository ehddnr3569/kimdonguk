using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ClassTest2_1.Model
{
    class Deal<Ca,Cu,Se>
    {
        private Ca ca;
        private Cu cu;
        private Se se;
        private string date;
        private string price;

        public Deal(Ca ca, Cu cu, Se se, string date, string price)
        {
            this.ca = ca;
            this.cu = cu;
            this.se = se;
            this.date = date;
            this.price = price;
        }

        public Ca Car { get => ca; set => ca = value; }
        public Cu Customer { get => cu; set => cu = value; }
        public Se Sealler { get => se; set => se = value; }
        public string Date { get => date; set => date = value; }
        public string Price { get => price; set => price = value; }
    }
}

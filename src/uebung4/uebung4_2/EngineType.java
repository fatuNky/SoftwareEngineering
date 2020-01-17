package uebung4.uebung4_2;
    public enum EngineType {
        DIESEL(ConsumptionUnit.LITER), PETROL(ConsumptionUnit.LITER), ELECTRIC(ConsumptionUnit.KHW);
        private int type;
        private ConsumptionUnit unit;
        EngineType(ConsumptionUnit unit) {
            this.unit = unit;
        }
    }



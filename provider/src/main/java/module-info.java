import org.example.provider.Kilograms;
import org.example.provider.Pounds;
import org.example.service.WeightConversion;

module org.example.provider {
    requires org.example.service;

    provides WeightConversion with Kilograms, Pounds;
}
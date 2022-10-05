import { StyleSheet } from 'react-native';

import EditScreenInfo from '../components/EditScreenInfo';
import { Text, View } from 'react-native';
import { RootTabScreenProps } from '../types';

export default function TabOneScreen() {
  return (
    <View style={styles.container}>
      <Text>
        oi
      </Text>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backegroundColor: '#F5FC31',
}
});

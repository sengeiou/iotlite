import { module, test } from 'qunit';
import { setupTest } from 'ember-qunit';

module('Unit | Route | device_develop', function(hooks) {
  setupTest(hooks);

  test('it exists', function(assert) {
    let route = this.owner.lookup('route:device-develop');
    assert.ok(route);
  });
});

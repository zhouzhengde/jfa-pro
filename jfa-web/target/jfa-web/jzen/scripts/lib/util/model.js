define(['jquery', 'underscore', 'util'], function ($, _, $$) {

    var Model = {

        inherited: function (o) {
        },

        created: function () {

        },

        prototype: {
            init: function () {
            }
        },

        create: function () {
            var o = Object.create(this);
            o.parent = this;
            o.prototype = o.fn = Object.create(this.prototype);

            o.created();
            this.inherited(o);
            return o;
        },

        init: function () {
            var instance = Object.create(Model.prototype);
            instance.parent = Model;
            instance.init.apply(instance, arguments);
            return instance;
        }
    };

    return Model;
});
.class Landroidx/core/location/l$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/location/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# direct methods
.method public static a(Landroidx/core/location/l;)Landroid/location/LocationRequest;
    .locals 3

    new-instance v0, Landroid/location/LocationRequest$Builder;

    invoke-virtual {p0}, Landroidx/core/location/l;->b()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Landroid/location/LocationRequest$Builder;-><init>(J)V

    invoke-virtual {p0}, Landroidx/core/location/l;->g()I

    move-result v1

    invoke-static {v0, v1}, Landroidx/core/location/m;->a(Landroid/location/LocationRequest$Builder;I)Landroid/location/LocationRequest$Builder;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/core/location/l;->f()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Landroidx/core/location/n;->a(Landroid/location/LocationRequest$Builder;J)Landroid/location/LocationRequest$Builder;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/core/location/l;->a()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Landroidx/core/location/o;->a(Landroid/location/LocationRequest$Builder;J)Landroid/location/LocationRequest$Builder;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/core/location/l;->d()I

    move-result v1

    invoke-static {v0, v1}, Landroidx/core/location/p;->a(Landroid/location/LocationRequest$Builder;I)Landroid/location/LocationRequest$Builder;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/core/location/l;->e()F

    move-result v1

    invoke-static {v0, v1}, Landroidx/core/location/q;->a(Landroid/location/LocationRequest$Builder;F)Landroid/location/LocationRequest$Builder;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/core/location/l;->c()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Landroidx/core/location/r;->a(Landroid/location/LocationRequest$Builder;J)Landroid/location/LocationRequest$Builder;

    move-result-object p0

    invoke-static {p0}, Landroidx/core/location/s;->a(Landroid/location/LocationRequest$Builder;)Landroid/location/LocationRequest;

    move-result-object p0

    return-object p0
.end method

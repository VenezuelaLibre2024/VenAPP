.class Lv2/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/location/Geocoder$GeocodeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv2/b;->d(Landroid/location/Geocoder;Ljava/lang/String;ILv2/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lv2/a;

.field final synthetic b:Lv2/b;


# direct methods
.method constructor <init>(Lv2/b;Lv2/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lv2/b$a;->b:Lv2/b;

    iput-object p2, p0, Lv2/b$a;->a:Lv2/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lv2/b$a;->a:Lv2/a;

    invoke-interface {v0, p1}, Lv2/a;->onError(Ljava/lang/String;)V

    return-void
.end method

.method public onGeocode(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/location/Address;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lv2/b$a;->a:Lv2/a;

    invoke-interface {v0, p1}, Lv2/a;->onGeocode(Ljava/util/List;)V

    return-void
.end method

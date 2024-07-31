.class public final Lxd/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbk/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lbk/a;"
    }
.end annotation


# instance fields
.field private final a:Lxd/g;

.field private final b:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Landroid/util/DisplayMetrics;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lxd/g;Lbk/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxd/g;",
            "Lbk/a<",
            "Landroid/util/DisplayMetrics;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxd/h;->a:Lxd/g;

    iput-object p2, p0, Lxd/h;->b:Lbk/a;

    return-void
.end method

.method public static a(Lxd/g;Lbk/a;)Lxd/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxd/g;",
            "Lbk/a<",
            "Landroid/util/DisplayMetrics;",
            ">;)",
            "Lxd/h;"
        }
    .end annotation

    new-instance v0, Lxd/h;

    invoke-direct {v0, p0, p1}, Lxd/h;-><init>(Lxd/g;Lbk/a;)V

    return-object v0
.end method

.method public static c(Lxd/g;Landroid/util/DisplayMetrics;)Lud/l;
    .locals 0

    invoke-virtual {p0, p1}, Lxd/g;->b(Landroid/util/DisplayMetrics;)Lud/l;

    move-result-object p0

    invoke-static {p0}, Ltd/d;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lud/l;

    return-object p0
.end method


# virtual methods
.method public b()Lud/l;
    .locals 2

    iget-object v0, p0, Lxd/h;->a:Lxd/g;

    iget-object v1, p0, Lxd/h;->b:Lbk/a;

    invoke-interface {v1}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/DisplayMetrics;

    invoke-static {v0, v1}, Lxd/h;->c(Lxd/g;Landroid/util/DisplayMetrics;)Lud/l;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lxd/h;->b()Lud/l;

    move-result-object v0

    return-object v0
.end method

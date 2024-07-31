.class public final Lxd/l;
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
            "Landroid/app/Application;",
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
            "Landroid/app/Application;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxd/l;->a:Lxd/g;

    iput-object p2, p0, Lxd/l;->b:Lbk/a;

    return-void
.end method

.method public static a(Lxd/g;Lbk/a;)Lxd/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxd/g;",
            "Lbk/a<",
            "Landroid/app/Application;",
            ">;)",
            "Lxd/l;"
        }
    .end annotation

    new-instance v0, Lxd/l;

    invoke-direct {v0, p0, p1}, Lxd/l;-><init>(Lxd/g;Lbk/a;)V

    return-object v0
.end method

.method public static c(Lxd/g;Landroid/app/Application;)Landroid/util/DisplayMetrics;
    .locals 0

    invoke-virtual {p0, p1}, Lxd/g;->f(Landroid/app/Application;)Landroid/util/DisplayMetrics;

    move-result-object p0

    invoke-static {p0}, Ltd/d;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/util/DisplayMetrics;

    return-object p0
.end method


# virtual methods
.method public b()Landroid/util/DisplayMetrics;
    .locals 2

    iget-object v0, p0, Lxd/l;->a:Lxd/g;

    iget-object v1, p0, Lxd/l;->b:Lbk/a;

    invoke-interface {v1}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/Application;

    invoke-static {v0, v1}, Lxd/l;->c(Lxd/g;Landroid/app/Application;)Landroid/util/DisplayMetrics;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lxd/l;->b()Landroid/util/DisplayMetrics;

    move-result-object v0

    return-object v0
.end method

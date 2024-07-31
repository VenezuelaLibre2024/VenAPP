.class final Loi/s$e;
.super Lkotlin/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lok/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loi/s;->M(Lvf/b;ZLw/p;ZLpi/b;Lok/l;Lok/l;Lok/l;Lok/l;JLandroid/util/Size;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/o;",
        "Lok/l<",
        "Lw/k1;",
        "Lck/v;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lok/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lok/l<",
            "Ljava/lang/Double;",
            "Lck/v;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lok/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lok/l<",
            "-",
            "Ljava/lang/Double;",
            "Lck/v;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Loi/s$e;->a:Lok/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/o;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lw/k1;)V
    .locals 3

    iget-object v0, p0, Loi/s$e;->a:Lok/l;

    invoke-interface {p1}, Lw/k1;->b()F

    move-result p1

    float-to-double v1, p1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-interface {v0, p1}, Lok/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lw/k1;

    invoke-virtual {p0, p1}, Loi/s$e;->a(Lw/k1;)V

    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1
.end method

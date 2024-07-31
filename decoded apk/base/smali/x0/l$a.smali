.class final Lx0/l$a;
.super Lkotlin/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lok/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx0/l;-><init>(Lzk/k0;Lok/l;Lok/p;Lok/p;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/o;",
        "Lok/l<",
        "Ljava/lang/Throwable;",
        "Lck/v;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lok/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lok/l<",
            "Ljava/lang/Throwable;",
            "Lck/v;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic b:Lx0/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx0/l<",
            "TT;>;"
        }
    .end annotation
.end field

.field final synthetic c:Lok/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lok/p<",
            "TT;",
            "Ljava/lang/Throwable;",
            "Lck/v;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lok/l;Lx0/l;Lok/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lok/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lck/v;",
            ">;",
            "Lx0/l<",
            "TT;>;",
            "Lok/p<",
            "-TT;-",
            "Ljava/lang/Throwable;",
            "Lck/v;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lx0/l$a;->a:Lok/l;

    iput-object p2, p0, Lx0/l$a;->b:Lx0/l;

    iput-object p3, p0, Lx0/l$a;->c:Lok/p;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/o;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lx0/l$a;->a:Lok/l;

    invoke-interface {v0, p1}, Lok/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lx0/l$a;->b:Lx0/l;

    invoke-static {v0}, Lx0/l;->b(Lx0/l;)Lbl/d;

    move-result-object v0

    invoke-interface {v0, p1}, Lbl/o;->d(Ljava/lang/Throwable;)Z

    :cond_0
    iget-object v0, p0, Lx0/l$a;->b:Lx0/l;

    invoke-static {v0}, Lx0/l;->b(Lx0/l;)Lbl/d;

    move-result-object v0

    invoke-interface {v0}, Lbl/n;->c()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lbl/g;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lx0/l$a;->c:Lok/p;

    invoke-interface {v1, v0, p1}, Lok/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lck/v;->a:Lck/v;

    :goto_0
    if-nez v0, :cond_0

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lx0/l$a;->a(Ljava/lang/Throwable;)V

    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1
.end method

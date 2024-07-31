.class final Lbl/b$c$a;
.super Lkotlin/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lok/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbl/b$c;->a(Lhl/b;Ljava/lang/Object;Ljava/lang/Object;)Lok/l;
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
.field final synthetic a:Ljava/lang/Object;

.field final synthetic b:Lbl/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbl/b<",
            "TE;>;"
        }
    .end annotation
.end field

.field final synthetic c:Lhl/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhl/b<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/Object;Lbl/b;Lhl/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lbl/b<",
            "TE;>;",
            "Lhl/b<",
            "*>;)V"
        }
    .end annotation

    iput-object p1, p0, Lbl/b$c$a;->a:Ljava/lang/Object;

    iput-object p2, p0, Lbl/b$c$a;->b:Lbl/b;

    iput-object p3, p0, Lbl/b$c$a;->c:Lhl/b;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/o;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    iget-object p1, p0, Lbl/b$c$a;->a:Ljava/lang/Object;

    invoke-static {}, Lbl/c;->z()Lel/h0;

    move-result-object v0

    if-eq p1, v0, :cond_0

    iget-object p1, p0, Lbl/b$c$a;->b:Lbl/b;

    iget-object p1, p1, Lbl/b;->c:Lok/l;

    iget-object v0, p0, Lbl/b$c$a;->a:Ljava/lang/Object;

    iget-object v1, p0, Lbl/b$c$a;->c:Lhl/b;

    invoke-interface {v1}, Lhl/b;->getContext()Lgk/f;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lel/z;->b(Lok/l;Ljava/lang/Object;Lgk/f;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lbl/b$c$a;->a(Ljava/lang/Throwable;)V

    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1
.end method

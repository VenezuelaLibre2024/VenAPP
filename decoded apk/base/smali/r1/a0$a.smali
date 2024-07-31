.class public final Lr1/a0$a;
.super Lr1/o$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr1/a0;-><init>(Lr1/u;Lr1/m;ZLjava/util/concurrent/Callable;[Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic b:Lr1/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr1/a0<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>([Ljava/lang/String;Lr1/a0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            "Lr1/a0<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p2, p0, Lr1/a0$a;->b:Lr1/a0;

    invoke-direct {p0, p1}, Lr1/o$c;-><init>([Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public c(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "tables"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lk/c;->h()Lk/c;

    move-result-object p1

    iget-object v0, p0, Lr1/a0$a;->b:Lr1/a0;

    invoke-virtual {v0}, Lr1/a0;->d()Ljava/lang/Runnable;

    move-result-object v0

    invoke-virtual {p1, v0}, Lk/f;->b(Ljava/lang/Runnable;)V

    return-void
.end method

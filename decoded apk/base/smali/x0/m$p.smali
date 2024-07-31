.class final Lx0/m$p;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx0/m;->y(Lok/p;Lgk/f;Lgk/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "androidx.datastore.core.SingleProcessDataStore"
    f = "SingleProcessDataStore.kt"
    l = {
        0x192,
        0x19a
    }
    m = "transformAndWrite"
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field c:Ljava/lang/Object;

.field synthetic d:Ljava/lang/Object;

.field final synthetic e:Lx0/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx0/m<",
            "TT;>;"
        }
    .end annotation
.end field

.field f:I


# direct methods
.method constructor <init>(Lx0/m;Lgk/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx0/m<",
            "TT;>;",
            "Lgk/Continuation<",
            "-",
            "Lx0/m$p;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lx0/m$p;->e:Lx0/m;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Lgk/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lx0/m$p;->d:Ljava/lang/Object;

    iget p1, p0, Lx0/m$p;->f:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lx0/m$p;->f:I

    iget-object p1, p0, Lx0/m$p;->e:Lx0/m;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lx0/m;->o(Lx0/m;Lok/p;Lgk/f;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.class final Lcl/m$a;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcl/m;->a(Lcl/c;Lgk/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "kotlinx.coroutines.flow.StateFlowImpl"
    f = "StateFlow.kt"
    l = {
        0x180,
        0x18c,
        0x191
    }
    m = "collect"
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field c:Ljava/lang/Object;

.field d:Ljava/lang/Object;

.field e:Ljava/lang/Object;

.field synthetic f:Ljava/lang/Object;

.field final synthetic r:Lcl/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcl/m<",
            "TT;>;"
        }
    .end annotation
.end field

.field s:I


# direct methods
.method constructor <init>(Lcl/m;Lgk/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcl/m<",
            "TT;>;",
            "Lgk/Continuation<",
            "-",
            "Lcl/m$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcl/m$a;->r:Lcl/m;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Lgk/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcl/m$a;->f:Ljava/lang/Object;

    iget p1, p0, Lcl/m$a;->s:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcl/m$a;->s:I

    iget-object p1, p0, Lcl/m$a;->r:Lcl/m;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lcl/m;->a(Lcl/c;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

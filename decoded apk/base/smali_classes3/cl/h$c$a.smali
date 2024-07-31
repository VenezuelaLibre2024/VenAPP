.class final Lcl/h$c$a;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcl/h$c;->emit(Ljava/lang/Object;Lgk/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2"
    f = "Errors.kt"
    l = {
        0x9e
    }
    m = "emit"
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field synthetic b:Ljava/lang/Object;

.field final synthetic c:Lcl/h$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcl/h$c<",
            "TT;>;"
        }
    .end annotation
.end field

.field d:I


# direct methods
.method constructor <init>(Lcl/h$c;Lgk/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcl/h$c<",
            "-TT;>;",
            "Lgk/Continuation<",
            "-",
            "Lcl/h$c$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcl/h$c$a;->c:Lcl/h$c;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Lgk/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcl/h$c$a;->b:Ljava/lang/Object;

    iget p1, p0, Lcl/h$c$a;->d:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcl/h$c$a;->d:I

    iget-object p1, p0, Lcl/h$c$a;->c:Lcl/h$c;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lcl/h$c;->emit(Ljava/lang/Object;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

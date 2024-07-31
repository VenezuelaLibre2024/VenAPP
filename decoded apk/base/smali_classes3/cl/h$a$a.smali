.class public final Lcl/h$a$a;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcl/h$a;->a(Lcl/c;Lgk/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1"
    f = "Errors.kt"
    l = {
        0x71,
        0x72
    }
    m = "collect"
.end annotation


# instance fields
.field synthetic a:Ljava/lang/Object;

.field b:I

.field final synthetic c:Lcl/h$a;

.field d:Ljava/lang/Object;

.field e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcl/h$a;Lgk/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcl/h$a$a;->c:Lcl/h$a;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Lgk/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcl/h$a$a;->a:Ljava/lang/Object;

    iget p1, p0, Lcl/h$a$a;->b:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcl/h$a$a;->b:I

    iget-object p1, p0, Lcl/h$a$a;->c:Lcl/h$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lcl/h$a;->a(Lcl/c;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

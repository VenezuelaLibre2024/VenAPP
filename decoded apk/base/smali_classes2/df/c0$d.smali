.class final Ldf/c0$d;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldf/c0;->j(Lgk/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "com.google.firebase.sessions.SessionFirelogPublisherImpl"
    f = "SessionFirelogPublisher.kt"
    l = {
        0x5f
    }
    m = "shouldLogSession"
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field synthetic b:Ljava/lang/Object;

.field final synthetic c:Ldf/c0;

.field d:I


# direct methods
.method constructor <init>(Ldf/c0;Lgk/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldf/c0;",
            "Lgk/Continuation<",
            "-",
            "Ldf/c0$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldf/c0$d;->c:Ldf/c0;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Lgk/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ldf/c0$d;->b:Ljava/lang/Object;

    iget p1, p0, Ldf/c0$d;->d:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ldf/c0$d;->d:I

    iget-object p1, p0, Ldf/c0$d;->c:Ldf/c0;

    invoke-static {p1, p0}, Ldf/c0;->f(Ldf/c0;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.class public final Ldf/x$e$a$a;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldf/x$e$a;->emit(Ljava/lang/Object;Lgk/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2"
    f = "SessionDatastore.kt"
    l = {
        0xe0
    }
    m = "emit"
.end annotation


# instance fields
.field synthetic a:Ljava/lang/Object;

.field b:I

.field final synthetic c:Ldf/x$e$a;


# direct methods
.method public constructor <init>(Ldf/x$e$a;Lgk/Continuation;)V
    .locals 0

    iput-object p1, p0, Ldf/x$e$a$a;->c:Ldf/x$e$a;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Lgk/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ldf/x$e$a$a;->a:Ljava/lang/Object;

    iget p1, p0, Ldf/x$e$a$a;->b:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ldf/x$e$a$a;->b:I

    iget-object p1, p0, Ldf/x$e$a$a;->c:Ldf/x$e$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Ldf/x$e$a;->emit(Ljava/lang/Object;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

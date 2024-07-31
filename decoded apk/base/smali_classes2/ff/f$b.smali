.class final Lff/f$b;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lff/f;->g(Lgk/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "com.google.firebase.sessions.settings.SessionsSettings"
    f = "SessionsSettings.kt"
    l = {
        0x86,
        0x87
    }
    m = "updateSettings"
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field synthetic b:Ljava/lang/Object;

.field final synthetic c:Lff/f;

.field d:I


# direct methods
.method constructor <init>(Lff/f;Lgk/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lff/f;",
            "Lgk/Continuation<",
            "-",
            "Lff/f$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lff/f$b;->c:Lff/f;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Lgk/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lff/f$b;->b:Ljava/lang/Object;

    iget p1, p0, Lff/f$b;->d:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lff/f$b;->d:I

    iget-object p1, p0, Lff/f$b;->c:Lff/f;

    invoke-virtual {p1, p0}, Lff/f;->g(Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

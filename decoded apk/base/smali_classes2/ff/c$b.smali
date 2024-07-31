.class final Lff/c$b;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lff/c;->d(Lgk/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "com.google.firebase.sessions.settings.RemoteSettings"
    f = "RemoteSettings.kt"
    l = {
        0xaa,
        0x4c,
        0x5e
    }
    m = "updateSettings"
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field synthetic c:Ljava/lang/Object;

.field final synthetic d:Lff/c;

.field e:I


# direct methods
.method constructor <init>(Lff/c;Lgk/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lff/c;",
            "Lgk/Continuation<",
            "-",
            "Lff/c$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lff/c$b;->d:Lff/c;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Lgk/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lff/c$b;->c:Ljava/lang/Object;

    iget p1, p0, Lff/c$b;->e:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lff/c$b;->e:I

    iget-object p1, p0, Lff/c$b;->d:Lff/c;

    invoke-virtual {p1, p0}, Lff/c;->d(Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

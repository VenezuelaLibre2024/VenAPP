.class final Lef/a$b;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lef/a;->c(Lgk/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "com.google.firebase.sessions.api.FirebaseSessionsDependencies"
    f = "FirebaseSessionsDependencies.kt"
    l = {
        0x7b
    }
    m = "getRegisteredSubscribers$com_google_firebase_firebase_sessions"
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field c:Ljava/lang/Object;

.field d:Ljava/lang/Object;

.field e:Ljava/lang/Object;

.field f:Ljava/lang/Object;

.field synthetic r:Ljava/lang/Object;

.field final synthetic s:Lef/a;

.field t:I


# direct methods
.method constructor <init>(Lef/a;Lgk/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lef/a;",
            "Lgk/Continuation<",
            "-",
            "Lef/a$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lef/a$b;->s:Lef/a;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Lgk/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lef/a$b;->r:Ljava/lang/Object;

    iget p1, p0, Lef/a$b;->t:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lef/a$b;->t:I

    iget-object p1, p0, Lef/a$b;->s:Lef/a;

    invoke-virtual {p1, p0}, Lef/a;->c(Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

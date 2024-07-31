.class final Lff/g$c;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lff/g;->h(La1/d$a;Ljava/lang/Object;Lgk/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlin/coroutines/jvm/internal/d;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "com.google.firebase.sessions.settings.SettingsCache"
    f = "SettingsCache.kt"
    l = {
        0x70
    }
    m = "updateConfigValue"
.end annotation


# instance fields
.field synthetic a:Ljava/lang/Object;

.field final synthetic b:Lff/g;

.field c:I


# direct methods
.method constructor <init>(Lff/g;Lgk/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lff/g;",
            "Lgk/Continuation<",
            "-",
            "Lff/g$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lff/g$c;->b:Lff/g;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Lgk/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lff/g$c;->a:Ljava/lang/Object;

    iget p1, p0, Lff/g$c;->c:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lff/g$c;->c:I

    iget-object p1, p0, Lff/g$c;->b:Lff/g;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lff/g;->b(Lff/g;La1/d$a;Ljava/lang/Object;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.class final Lx0/e$a$b;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx0/e$a;->c(Ljava/util/List;Lx0/i;Lgk/Continuation;)Ljava/lang/Object;
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
    c = "androidx.datastore.core.DataMigrationInitializer$Companion"
    f = "DataMigrationInitializer.kt"
    l = {
        0x2a,
        0x39
    }
    m = "runMigrations"
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field synthetic c:Ljava/lang/Object;

.field final synthetic d:Lx0/e$a;

.field e:I


# direct methods
.method constructor <init>(Lx0/e$a;Lgk/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx0/e$a;",
            "Lgk/Continuation<",
            "-",
            "Lx0/e$a$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lx0/e$a$b;->d:Lx0/e$a;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Lgk/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lx0/e$a$b;->c:Ljava/lang/Object;

    iget p1, p0, Lx0/e$a$b;->e:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lx0/e$a$b;->e:I

    iget-object p1, p0, Lx0/e$a$b;->d:Lx0/e$a;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lx0/e$a;->a(Lx0/e$a;Ljava/util/List;Lx0/i;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

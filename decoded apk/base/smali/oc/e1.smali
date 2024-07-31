.class public final Loc/e1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final c:Loc/e1;


# instance fields
.field private final a:Loc/m0;

.field private final b:Loc/v;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Loc/e1;

    invoke-direct {v0}, Loc/e1;-><init>()V

    sput-object v0, Loc/e1;->c:Loc/e1;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-static {}, Loc/m0;->j()Loc/m0;

    move-result-object v0

    invoke-static {}, Loc/v;->b()Loc/v;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Loc/e1;-><init>(Loc/m0;Loc/v;)V

    return-void
.end method

.method private constructor <init>(Loc/m0;Loc/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loc/e1;->a:Loc/m0;

    iput-object p2, p0, Loc/e1;->b:Loc/v;

    return-void
.end method

.method public static f()Loc/e1;
    .locals 1

    sget-object v0, Loc/e1;->c:Loc/e1;

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/content/Context;)V
    .locals 1

    iget-object v0, p0, Loc/e1;->a:Loc/m0;

    invoke-virtual {v0, p1}, Loc/m0;->a(Landroid/content/Context;)V

    return-void
.end method

.method public final b(Lcom/google/firebase/auth/FirebaseAuth;)V
    .locals 1

    iget-object v0, p0, Loc/e1;->a:Loc/m0;

    invoke-virtual {v0, p1}, Loc/m0;->h(Lcom/google/firebase/auth/FirebaseAuth;)V

    return-void
.end method

.method public final c(Landroid/app/Activity;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/auth/FirebaseAuth;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Lcom/google/firebase/auth/i;",
            ">;",
            "Lcom/google/firebase/auth/FirebaseAuth;",
            ")Z"
        }
    .end annotation

    iget-object v0, p0, Loc/e1;->b:Loc/v;

    invoke-virtual {v0, p1, p2, p3}, Loc/v;->i(Landroid/app/Activity;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/auth/FirebaseAuth;)Z

    move-result p1

    return p1
.end method

.method public final d(Landroid/app/Activity;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/auth/a0;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Lcom/google/firebase/auth/i;",
            ">;",
            "Lcom/google/firebase/auth/FirebaseAuth;",
            "Lcom/google/firebase/auth/a0;",
            ")Z"
        }
    .end annotation

    iget-object v0, p0, Loc/e1;->b:Loc/v;

    invoke-virtual {v0, p1, p2, p3, p4}, Loc/v;->j(Landroid/app/Activity;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/auth/a0;)Z

    move-result p1

    return p1
.end method

.method public final e()Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Loc/e1;->a:Loc/m0;

    invoke-virtual {v0}, Loc/m0;->i()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.class public final Loc/v;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static c:Loc/v;


# instance fields
.field private a:Z

.field private b:Landroid/content/BroadcastReceiver;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Loc/v;->a:Z

    return-void
.end method

.method private static a(Landroid/content/Intent;)Lcom/google/firebase/auth/h;
    .locals 2

    invoke-static {p0}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST"

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzagt;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p0, v0, v1}, Lea/e;->b(Landroid/content/Intent;Ljava/lang/String;Landroid/os/Parcelable$Creator;)Lea/d;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/zzagt;

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzagt;->zzc(Z)Lcom/google/android/gms/internal/firebase-auth-api/zzagt;

    move-result-object p0

    invoke-static {p0}, Lcom/google/firebase/auth/d2;->B1(Lcom/google/android/gms/internal/firebase-auth-api/zzagt;)Lcom/google/firebase/auth/d2;

    move-result-object p0

    return-object p0
.end method

.method public static b()Loc/v;
    .locals 1

    sget-object v0, Loc/v;->c:Loc/v;

    if-nez v0, :cond_0

    new-instance v0, Loc/v;

    invoke-direct {v0}, Loc/v;-><init>()V

    sput-object v0, Loc/v;->c:Loc/v;

    :cond_0
    sget-object v0, Loc/v;->c:Loc/v;

    return-object v0
.end method

.method private final c(Landroid/app/Activity;Landroid/content/BroadcastReceiver;)V
    .locals 2

    iput-object p2, p0, Loc/v;->b:Landroid/content/BroadcastReceiver;

    invoke-static {p1}, Lk1/a;->b(Landroid/content/Context;)Lk1/a;

    move-result-object p1

    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2, v0}, Lk1/a;->c(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    return-void
.end method

.method static d(Landroid/content/Context;)V
    .locals 2

    sget-object v0, Loc/v;->c:Loc/v;

    const/4 v1, 0x0

    iput-boolean v1, v0, Loc/v;->a:Z

    iget-object v0, v0, Loc/v;->b:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_0

    invoke-static {p0}, Lk1/a;->b(Landroid/content/Context;)Lk1/a;

    move-result-object p0

    sget-object v0, Loc/v;->c:Loc/v;

    iget-object v0, v0, Loc/v;->b:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Lk1/a;->e(Landroid/content/BroadcastReceiver;)V

    :cond_0
    sget-object p0, Loc/v;->c:Loc/v;

    const/4 v0, 0x0

    iput-object v0, p0, Loc/v;->b:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method static synthetic e(Loc/v;Landroid/content/Intent;Lcom/google/android/gms/tasks/TaskCompletionSource;Landroid/content/Context;)V
    .locals 0

    const-string p0, "com.google.firebase.auth.internal.RECAPTCHA_TOKEN"

    invoke-virtual {p1, p0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    invoke-static {p3}, Loc/v;->d(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic f(Loc/v;Landroid/content/Intent;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/auth/FirebaseAuth;Landroid/content/Context;)V
    .locals 0

    invoke-static {p1}, Loc/v;->a(Landroid/content/Intent;)Lcom/google/firebase/auth/h;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/google/firebase/auth/FirebaseAuth;->y(Lcom/google/firebase/auth/h;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance p3, Loc/x;

    invoke-direct {p3, p0, p2, p4}, Loc/x;-><init>(Loc/v;Lcom/google/android/gms/tasks/TaskCompletionSource;Landroid/content/Context;)V

    invoke-virtual {p1, p3}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance p3, Loc/y;

    invoke-direct {p3, p0, p2, p4}, Loc/y;-><init>(Loc/v;Lcom/google/android/gms/tasks/TaskCompletionSource;Landroid/content/Context;)V

    invoke-virtual {p1, p3}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method static synthetic g(Loc/v;Landroid/content/Intent;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/auth/a0;Landroid/content/Context;)V
    .locals 0

    invoke-static {p1}, Loc/v;->a(Landroid/content/Intent;)Lcom/google/firebase/auth/h;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/google/firebase/auth/a0;->B1(Lcom/google/firebase/auth/h;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance p3, Loc/z;

    invoke-direct {p3, p0, p2, p4}, Loc/z;-><init>(Loc/v;Lcom/google/android/gms/tasks/TaskCompletionSource;Landroid/content/Context;)V

    invoke-virtual {p1, p3}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance p3, Loc/a0;

    invoke-direct {p3, p0, p2, p4}, Loc/a0;-><init>(Loc/v;Lcom/google/android/gms/tasks/TaskCompletionSource;Landroid/content/Context;)V

    invoke-virtual {p1, p3}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method static synthetic k(Loc/v;Landroid/content/Intent;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/auth/a0;Landroid/content/Context;)V
    .locals 0

    invoke-static {p1}, Loc/v;->a(Landroid/content/Intent;)Lcom/google/firebase/auth/h;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/google/firebase/auth/a0;->C1(Lcom/google/firebase/auth/h;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance p3, Loc/b0;

    invoke-direct {p3, p0, p2, p4}, Loc/b0;-><init>(Loc/v;Lcom/google/android/gms/tasks/TaskCompletionSource;Landroid/content/Context;)V

    invoke-virtual {p1, p3}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance p3, Loc/c0;

    invoke-direct {p3, p0, p2, p4}, Loc/c0;-><init>(Loc/v;Lcom/google/android/gms/tasks/TaskCompletionSource;Landroid/content/Context;)V

    invoke-virtual {p1, p3}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method


# virtual methods
.method public final h(Landroid/app/Activity;Lcom/google/android/gms/tasks/TaskCompletionSource;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    iget-boolean v0, p0, Loc/v;->a:Z

    if-nez v0, :cond_0

    new-instance v0, Loc/e0;

    invoke-direct {v0, p0, p1, p2}, Loc/e0;-><init>(Loc/v;Landroid/app/Activity;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-direct {p0, p1, v0}, Loc/v;->c(Landroid/app/Activity;Landroid/content/BroadcastReceiver;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Loc/v;->a:Z

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final i(Landroid/app/Activity;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/auth/FirebaseAuth;)Z
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

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Loc/v;->j(Landroid/app/Activity;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/auth/a0;)Z

    move-result p1

    return p1
.end method

.method public final j(Landroid/app/Activity;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/auth/a0;)Z
    .locals 7
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

    iget-boolean v0, p0, Loc/v;->a:Z

    if-nez v0, :cond_0

    new-instance v0, Loc/f0;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Loc/f0;-><init>(Loc/v;Landroid/app/Activity;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/auth/a0;)V

    invoke-direct {p0, p1, v0}, Loc/v;->c(Landroid/app/Activity;Landroid/content/BroadcastReceiver;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Loc/v;->a:Z

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

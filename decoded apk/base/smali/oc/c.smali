.class public final synthetic Loc/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field private synthetic a:Loc/d0;

.field private synthetic b:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field private synthetic c:Lcom/google/firebase/auth/FirebaseAuth;

.field private synthetic d:Loc/e1;

.field private synthetic e:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Loc/d0;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/auth/FirebaseAuth;Loc/e1;Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loc/c;->a:Loc/d0;

    iput-object p2, p0, Loc/c;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iput-object p3, p0, Loc/c;->c:Lcom/google/firebase/auth/FirebaseAuth;

    iput-object p4, p0, Loc/c;->d:Loc/e1;

    iput-object p5, p0, Loc/c;->e:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 6

    iget-object v0, p0, Loc/c;->a:Loc/d0;

    iget-object v1, p0, Loc/c;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iget-object v2, p0, Loc/c;->c:Lcom/google/firebase/auth/FirebaseAuth;

    iget-object v3, p0, Loc/c;->d:Loc/e1;

    iget-object v4, p0, Loc/c;->e:Landroid/app/Activity;

    move-object v5, p1

    invoke-virtual/range {v0 .. v5}, Loc/d0;->c(Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/auth/FirebaseAuth;Loc/e1;Landroid/app/Activity;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

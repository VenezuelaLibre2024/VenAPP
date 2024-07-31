.class public final synthetic Lcom/google/firebase/auth/h2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lcom/google/firebase/auth/q0$b;

.field private synthetic b:Lzb/m;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/auth/q0$b;Lzb/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/auth/h2;->a:Lcom/google/firebase/auth/q0$b;

    iput-object p2, p0, Lcom/google/firebase/auth/h2;->b:Lzb/m;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/auth/h2;->a:Lcom/google/firebase/auth/q0$b;

    iget-object v1, p0, Lcom/google/firebase/auth/h2;->b:Lzb/m;

    invoke-virtual {v0, v1}, Lcom/google/firebase/auth/q0$b;->onVerificationFailed(Lzb/m;)V

    return-void
.end method

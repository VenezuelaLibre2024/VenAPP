.class public final synthetic Lcom/google/firebase/auth/j1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpc/g;


# instance fields
.field private synthetic a:Lpc/e0;

.field private synthetic b:Lpc/e0;

.field private synthetic c:Lpc/e0;

.field private synthetic d:Lpc/e0;

.field private synthetic e:Lpc/e0;


# direct methods
.method public synthetic constructor <init>(Lpc/e0;Lpc/e0;Lpc/e0;Lpc/e0;Lpc/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/auth/j1;->a:Lpc/e0;

    iput-object p2, p0, Lcom/google/firebase/auth/j1;->b:Lpc/e0;

    iput-object p3, p0, Lcom/google/firebase/auth/j1;->c:Lpc/e0;

    iput-object p4, p0, Lcom/google/firebase/auth/j1;->d:Lpc/e0;

    iput-object p5, p0, Lcom/google/firebase/auth/j1;->e:Lpc/e0;

    return-void
.end method


# virtual methods
.method public final a(Lpc/d;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lcom/google/firebase/auth/j1;->a:Lpc/e0;

    iget-object v1, p0, Lcom/google/firebase/auth/j1;->b:Lpc/e0;

    iget-object v2, p0, Lcom/google/firebase/auth/j1;->c:Lpc/e0;

    iget-object v3, p0, Lcom/google/firebase/auth/j1;->d:Lpc/e0;

    iget-object v4, p0, Lcom/google/firebase/auth/j1;->e:Lpc/e0;

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/google/firebase/auth/FirebaseAuthRegistrar;->lambda$getComponents$0(Lpc/e0;Lpc/e0;Lpc/e0;Lpc/e0;Lpc/e0;Lpc/d;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object p1

    return-object p1
.end method

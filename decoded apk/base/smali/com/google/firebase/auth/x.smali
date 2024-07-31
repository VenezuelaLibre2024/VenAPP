.class public final Lcom/google/firebase/auth/x;
.super Lcom/google/firebase/auth/q;
.source "SourceFile"


# instance fields
.field private b:Lcom/google/firebase/auth/h;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/firebase/auth/q;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/x;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Lcom/google/firebase/auth/h;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/x;->b:Lcom/google/firebase/auth/h;

    return-object v0
.end method

.method public final d(Lcom/google/firebase/auth/h;)Lcom/google/firebase/auth/x;
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/auth/x;->b:Lcom/google/firebase/auth/h;

    return-object p0
.end method

.method public final e(Ljava/lang/String;)Lcom/google/firebase/auth/x;
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/auth/x;->c:Ljava/lang/String;

    return-object p0
.end method

.method public final f(Ljava/lang/String;)Lcom/google/firebase/auth/x;
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/auth/x;->d:Ljava/lang/String;

    return-object p0
.end method

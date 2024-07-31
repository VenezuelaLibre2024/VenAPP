.class public Lcom/google/firebase/auth/r0;
.super Lcom/google/firebase/auth/i0;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/firebase/auth/o0;


# direct methods
.method public constructor <init>(Lcom/google/firebase/auth/o0;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/firebase/auth/i0;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/firebase/auth/r0;->a:Lcom/google/firebase/auth/o0;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/firebase/auth/o0;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/r0;->a:Lcom/google/firebase/auth/o0;

    return-object v0
.end method

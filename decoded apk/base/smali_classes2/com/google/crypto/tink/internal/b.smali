.class public abstract Lcom/google/crypto/tink/internal/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/crypto/tink/internal/b$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<SerializationT::",
        "Lcom/google/crypto/tink/internal/q;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Lxb/a;

.field private final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TSerializationT;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lxb/a;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxb/a;",
            "Ljava/lang/Class<",
            "TSerializationT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/crypto/tink/internal/b;->a:Lxb/a;

    iput-object p2, p0, Lcom/google/crypto/tink/internal/b;->b:Ljava/lang/Class;

    return-void
.end method

.method synthetic constructor <init>(Lxb/a;Ljava/lang/Class;Lcom/google/crypto/tink/internal/b$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/crypto/tink/internal/b;-><init>(Lxb/a;Ljava/lang/Class;)V

    return-void
.end method

.method public static a(Lcom/google/crypto/tink/internal/b$b;Lxb/a;Ljava/lang/Class;)Lcom/google/crypto/tink/internal/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<SerializationT::",
            "Lcom/google/crypto/tink/internal/q;",
            ">(",
            "Lcom/google/crypto/tink/internal/b$b<",
            "TSerializationT;>;",
            "Lxb/a;",
            "Ljava/lang/Class<",
            "TSerializationT;>;)",
            "Lcom/google/crypto/tink/internal/b<",
            "TSerializationT;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/crypto/tink/internal/b$a;

    invoke-direct {v0, p1, p2, p0}, Lcom/google/crypto/tink/internal/b$a;-><init>(Lxb/a;Ljava/lang/Class;Lcom/google/crypto/tink/internal/b$b;)V

    return-object v0
.end method


# virtual methods
.method public final b()Lxb/a;
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/internal/b;->a:Lxb/a;

    return-object v0
.end method

.method public final c()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "TSerializationT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/crypto/tink/internal/b;->b:Ljava/lang/Class;

    return-object v0
.end method

.method public abstract d(Lcom/google/crypto/tink/internal/q;Ljb/y;)Ljb/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TSerializationT;",
            "Ljb/y;",
            ")",
            "Ljb/g;"
        }
    .end annotation
.end method

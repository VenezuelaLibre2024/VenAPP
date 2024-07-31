.class public abstract Lcom/google/crypto/tink/internal/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/crypto/tink/internal/j$b;
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

    iput-object p1, p0, Lcom/google/crypto/tink/internal/j;->a:Lxb/a;

    iput-object p2, p0, Lcom/google/crypto/tink/internal/j;->b:Ljava/lang/Class;

    return-void
.end method

.method synthetic constructor <init>(Lxb/a;Ljava/lang/Class;Lcom/google/crypto/tink/internal/j$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/crypto/tink/internal/j;-><init>(Lxb/a;Ljava/lang/Class;)V

    return-void
.end method

.method public static a(Lcom/google/crypto/tink/internal/j$b;Lxb/a;Ljava/lang/Class;)Lcom/google/crypto/tink/internal/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<SerializationT::",
            "Lcom/google/crypto/tink/internal/q;",
            ">(",
            "Lcom/google/crypto/tink/internal/j$b<",
            "TSerializationT;>;",
            "Lxb/a;",
            "Ljava/lang/Class<",
            "TSerializationT;>;)",
            "Lcom/google/crypto/tink/internal/j<",
            "TSerializationT;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/crypto/tink/internal/j$a;

    invoke-direct {v0, p1, p2, p0}, Lcom/google/crypto/tink/internal/j$a;-><init>(Lxb/a;Ljava/lang/Class;Lcom/google/crypto/tink/internal/j$b;)V

    return-object v0
.end method


# virtual methods
.method public final b()Lxb/a;
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/internal/j;->a:Lxb/a;

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

    iget-object v0, p0, Lcom/google/crypto/tink/internal/j;->b:Ljava/lang/Class;

    return-object v0
.end method

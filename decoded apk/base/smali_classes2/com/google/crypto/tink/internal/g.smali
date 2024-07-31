.class public final Lcom/google/crypto/tink/internal/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/crypto/tink/internal/g$b;
    }
.end annotation


# static fields
.field private static final b:Lcom/google/crypto/tink/internal/g;

.field private static final c:Lcom/google/crypto/tink/internal/g$b;


# instance fields
.field private final a:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Ltb/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/crypto/tink/internal/g;

    invoke-direct {v0}, Lcom/google/crypto/tink/internal/g;-><init>()V

    sput-object v0, Lcom/google/crypto/tink/internal/g;->b:Lcom/google/crypto/tink/internal/g;

    new-instance v0, Lcom/google/crypto/tink/internal/g$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/crypto/tink/internal/g$b;-><init>(Lcom/google/crypto/tink/internal/g$a;)V

    sput-object v0, Lcom/google/crypto/tink/internal/g;->c:Lcom/google/crypto/tink/internal/g$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lcom/google/crypto/tink/internal/g;->a:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public static b()Lcom/google/crypto/tink/internal/g;
    .locals 1

    sget-object v0, Lcom/google/crypto/tink/internal/g;->b:Lcom/google/crypto/tink/internal/g;

    return-object v0
.end method


# virtual methods
.method public a()Ltb/b;
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/internal/g;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltb/b;

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/crypto/tink/internal/g;->c:Lcom/google/crypto/tink/internal/g$b;

    :cond_0
    return-object v0
.end method

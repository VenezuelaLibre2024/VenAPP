.class public Lcom/google/firebase/storage/e$a;
.super Lcom/google/firebase/storage/e0$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/storage/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/firebase/storage/e0<",
        "Lcom/google/firebase/storage/e$a;",
        ">.b;"
    }
.end annotation


# instance fields
.field private final c:J

.field final synthetic d:Lcom/google/firebase/storage/e;


# direct methods
.method constructor <init>(Lcom/google/firebase/storage/e;Ljava/lang/Exception;J)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/storage/e$a;->d:Lcom/google/firebase/storage/e;

    invoke-direct {p0, p1, p2}, Lcom/google/firebase/storage/e0$b;-><init>(Lcom/google/firebase/storage/e0;Ljava/lang/Exception;)V

    iput-wide p3, p0, Lcom/google/firebase/storage/e$a;->c:J

    return-void
.end method


# virtual methods
.method public d()J
    .locals 2

    iget-wide v0, p0, Lcom/google/firebase/storage/e$a;->c:J

    return-wide v0
.end method

.method public e()J
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/storage/e$a;->d:Lcom/google/firebase/storage/e;

    invoke-virtual {v0}, Lcom/google/firebase/storage/e;->m0()J

    move-result-wide v0

    return-wide v0
.end method

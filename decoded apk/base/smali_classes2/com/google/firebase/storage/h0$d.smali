.class public Lcom/google/firebase/storage/h0$d;
.super Lcom/google/firebase/storage/e0$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/storage/h0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/firebase/storage/e0<",
        "Lcom/google/firebase/storage/h0$d;",
        ">.b;"
    }
.end annotation


# instance fields
.field private final c:J

.field final synthetic d:Lcom/google/firebase/storage/h0;


# direct methods
.method constructor <init>(Lcom/google/firebase/storage/h0;Ljava/lang/Exception;J)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/storage/h0$d;->d:Lcom/google/firebase/storage/h0;

    invoke-direct {p0, p1, p2}, Lcom/google/firebase/storage/e0$b;-><init>(Lcom/google/firebase/storage/e0;Ljava/lang/Exception;)V

    iput-wide p3, p0, Lcom/google/firebase/storage/h0$d;->c:J

    return-void
.end method

.class public Lcom/google/firebase/remoteconfig/internal/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lze/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/remoteconfig/internal/v$b;
    }
.end annotation


# instance fields
.field private final a:J

.field private final b:I

.field private final c:Lze/m;


# direct methods
.method private constructor <init>(JILze/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/google/firebase/remoteconfig/internal/v;->a:J

    iput p3, p0, Lcom/google/firebase/remoteconfig/internal/v;->b:I

    iput-object p4, p0, Lcom/google/firebase/remoteconfig/internal/v;->c:Lze/m;

    return-void
.end method

.method synthetic constructor <init>(JILze/m;Lcom/google/firebase/remoteconfig/internal/v$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/firebase/remoteconfig/internal/v;-><init>(JILze/m;)V

    return-void
.end method

.method static b()Lcom/google/firebase/remoteconfig/internal/v$b;
    .locals 2

    new-instance v0, Lcom/google/firebase/remoteconfig/internal/v$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/firebase/remoteconfig/internal/v$b;-><init>(Lcom/google/firebase/remoteconfig/internal/v$a;)V

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/google/firebase/remoteconfig/internal/v;->b:I

    return v0
.end method

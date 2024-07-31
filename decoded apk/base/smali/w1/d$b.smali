.class final Lw1/d$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw1/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private a:Lw1/c;


# direct methods
.method public constructor <init>(Lw1/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw1/d$b;->a:Lw1/c;

    return-void
.end method


# virtual methods
.method public final a()Lw1/c;
    .locals 1

    iget-object v0, p0, Lw1/d$b;->a:Lw1/c;

    return-object v0
.end method

.method public final b(Lw1/c;)V
    .locals 0

    iput-object p1, p0, Lw1/d$b;->a:Lw1/c;

    return-void
.end method

.class public final Lzk/g;
.super Lzk/h1;
.source "SourceFile"


# instance fields
.field private final t:Ljava/lang/Thread;


# direct methods
.method public constructor <init>(Ljava/lang/Thread;)V
    .locals 0

    invoke-direct {p0}, Lzk/h1;-><init>()V

    iput-object p1, p0, Lzk/g;->t:Ljava/lang/Thread;

    return-void
.end method


# virtual methods
.method protected u1()Ljava/lang/Thread;
    .locals 1

    iget-object v0, p0, Lzk/g;->t:Ljava/lang/Thread;

    return-object v0
.end method

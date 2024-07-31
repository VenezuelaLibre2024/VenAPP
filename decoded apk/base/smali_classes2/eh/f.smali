.class public final Leh/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Leh/d;

.field private final b:Leh/d;

.field private final c:Leh/d;


# direct methods
.method public constructor <init>([Leh/d;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    aget-object v0, p1, v0

    iput-object v0, p0, Leh/f;->a:Leh/d;

    const/4 v0, 0x1

    aget-object v0, p1, v0

    iput-object v0, p0, Leh/f;->b:Leh/d;

    const/4 v0, 0x2

    aget-object p1, p1, v0

    iput-object p1, p0, Leh/f;->c:Leh/d;

    return-void
.end method


# virtual methods
.method public a()Leh/d;
    .locals 1

    iget-object v0, p0, Leh/f;->a:Leh/d;

    return-object v0
.end method

.method public b()Leh/d;
    .locals 1

    iget-object v0, p0, Leh/f;->b:Leh/d;

    return-object v0
.end method

.method public c()Leh/d;
    .locals 1

    iget-object v0, p0, Leh/f;->c:Leh/d;

    return-object v0
.end method

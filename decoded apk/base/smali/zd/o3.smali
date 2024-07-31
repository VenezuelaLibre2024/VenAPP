.class public Lzd/o3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ldj/r;

.field private final b:Ldj/r;

.field private final c:Ldj/r;


# direct methods
.method constructor <init>(Ldj/r;Ldj/r;Ldj/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/o3;->a:Ldj/r;

    iput-object p2, p0, Lzd/o3;->b:Ldj/r;

    iput-object p3, p0, Lzd/o3;->c:Ldj/r;

    return-void
.end method


# virtual methods
.method public a()Ldj/r;
    .locals 1

    iget-object v0, p0, Lzd/o3;->a:Ldj/r;

    return-object v0
.end method

.method public b()Ldj/r;
    .locals 1

    iget-object v0, p0, Lzd/o3;->c:Ldj/r;

    return-object v0
.end method

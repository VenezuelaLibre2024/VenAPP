.class public final Lx8/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:I

.field private final b:Ljava/lang/String;

.field private final c:J


# direct methods
.method private constructor <init>(ILjava/lang/String;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lx8/j;->a:I

    iput-object p2, p0, Lx8/j;->b:Ljava/lang/String;

    iput-wide p3, p0, Lx8/j;->c:J

    return-void
.end method

.method public static d(ILjava/lang/String;J)Lx8/j;
    .locals 1

    new-instance v0, Lx8/j;

    invoke-direct {v0, p0, p1, p2, p3}, Lx8/j;-><init>(ILjava/lang/String;J)V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lx8/j;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lx8/j;->a:I

    return v0
.end method

.method public c()J
    .locals 2

    iget-wide v0, p0, Lx8/j;->c:J

    return-wide v0
.end method

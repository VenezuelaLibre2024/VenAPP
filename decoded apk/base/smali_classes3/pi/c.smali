.class public final Lpi/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:D

.field private final b:D

.field private final c:Z

.field private final d:J

.field private final e:I


# direct methods
.method public constructor <init>(DDZJI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lpi/c;->a:D

    iput-wide p3, p0, Lpi/c;->b:D

    iput-boolean p5, p0, Lpi/c;->c:Z

    iput-wide p6, p0, Lpi/c;->d:J

    iput p8, p0, Lpi/c;->e:I

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Lpi/c;->c:Z

    return v0
.end method

.method public final b()D
    .locals 2

    iget-wide v0, p0, Lpi/c;->b:D

    return-wide v0
.end method

.method public final c()J
    .locals 2

    iget-wide v0, p0, Lpi/c;->d:J

    return-wide v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lpi/c;->e:I

    return v0
.end method

.method public final e()D
    .locals 2

    iget-wide v0, p0, Lpi/c;->a:D

    return-wide v0
.end method
